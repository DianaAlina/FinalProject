package org.me.pdms;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author diana
 */
public class OrdersList {
    
    private final static String PATH = PDMSWebService.PATH + "orders.txt";
    
    private File file = new File(PATH);
    
    private final HashMap<Integer,Order> orders = new HashMap();
    
    public OrdersList() {
          
        try {
            file.createNewFile();
        } catch (IOException e) {
             System.out.println("I/O error:  " + e.getMessage());
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            Gson gson = new Gson();
            
            String line = reader.readLine();
            
            while(line != null) {
                
                Order order = gson.fromJson(line, Order.class);
                
                orders.put(order.getID(), order);
                
                line = reader.readLine();
            }
            
        } catch (IOException e ) {
            
            System.out.println("I/O error:  " + e.getMessage());
        }
    }
    
    private int getNextAvailableID() {
        
        Set<Integer> ids = orders.keySet();
        
        int i = 0;
        while ( ids.contains(i) ) 
            i++;
        
        return i;
    }
    
    public String createOrder(String request, int stageID, int userID, int supplierID) {
        
        if (!(new StagesList()).isStage(stageID)) return "Provide valid stage";
        
        User user = (new Accounts()).findUserByID(userID);
        
        if (user == null) return "Provide a valid user";
        
        if (user.getType() == User.VOTER || user.getType() == User.CANDIDATE) 
            return "User can not be a client or a supplier";
        
        int id = getNextAvailableID();
        
        Order order = new Order(id, request, stageID, userID, supplierID);
        
        orders.put(id, order);
        
        writeToFile();
        
        (new NotificationsList()).createNotification(supplierID, "You have a new order");
        
        return "Success";
    }
    
    public Order findOrderByID(int id) {
        
        return orders.get(id);
    }
    
    public boolean isOrder(int id) {
        
        return orders.containsKey(id);
    }
    
    public Order[] getAllOrders() {
        return orders.values().toArray(new Order[0]);
    }
    
    public Order[] findOrdersByStage(int stageID) {
        
        ArrayList<Order> list = new ArrayList<>();
        
        for (Order order : orders.values()) {
            if (order.getStageID() == stageID)
                list.add(order);
        }
        
        return list.toArray(new Order[0]);
    }
    
    public Order[] findOrdersBySupplier(int supplierID) {
        
        ArrayList<Order> list = new ArrayList<>();
        
        for (Order order : orders.values()) {
            if (order.getSupplierID() == supplierID && !order.delivered())
                list.add(order);
        }
        
        return list.toArray(new Order[0]);
    }
    
    public void writeToFile() {
        
        file.delete();
        
        file = new File(PATH);
        
        try (PrintWriter pw = new PrintWriter( new FileWriter(file, true) )) {
            
            for (Order order : orders.values()) {
                    pw.println(order.toString()); 
            }
       
        } catch (IOException e) {
           
           System.out.println("I/O error: " + e.getMessage());           
        }
    }
    
}
