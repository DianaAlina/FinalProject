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
public class NotificationsList {
    
    private final static String PATH = PDMSWebService.PATH + "notifications.txt";
    
    private File file = new File(PATH);
    
    private final HashMap<Integer,Notification> notifications = new HashMap();
    
    public NotificationsList() {
          
        try {
            file.createNewFile();
        } catch (IOException e) {
             System.out.println("I/O error:  " + e.getMessage());
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            Gson gson = new Gson();
            
            String line = reader.readLine();
            
            while(line != null) {
                
                Notification notification = gson.fromJson(line, 
                        Notification.class);
                
                notifications.put(notification.getID(), notification);
                
                line = reader.readLine();
            }
            
        } catch (IOException e ) {
            
            System.out.println("I/O error:  " + e.getMessage());
        }
    }
    
    public boolean isNotification(int id) {
        return notifications.containsKey(id);
    }
    
    public Notification getNotificationByID(int id) {
        return notifications.get(id);
    }
    
    public Notification[] getAllNotifications() {
        return notifications.values().toArray(new Notification[0]);
    }
    
    public Notification[] getNotificationsOfUser(int userID) {
        
        ArrayList<Notification> list = new ArrayList<>();
        
        for (Notification notification : notifications.values()) {
            if (notification.getUserID() == userID) list.add(notification);
        }
        
        return list.toArray(new Notification[0]);
        
    }
    
    public Notification[] getUnseenNotificationsOfUser(int userID) {
        
        ArrayList<Notification> list = new ArrayList<>();
        
        for (Notification notification : notifications.values()) {
            if (notification.getUserID() == userID && !notification.seen()) 
                list.add(notification);
        }
        
        return list.toArray(new Notification[0]);
        
    }
    
    private int getNextAvailableID() {
        
        Set<Integer> ids = notifications.keySet();
        
        int i = 0;
        while ( ids.contains(i) ) 
            i++;
        
        return i;
    }
    
    public String createNotification(int userID, String message) {
        
        User user = (new Accounts()).findUserByID(userID);
        
        if (user == null) return "Provide a valid user id";
        
        int id = getNextAvailableID();
        
        Notification notification = new Notification(id, userID, message);
        
        notifications.put(id, notification);
        
        writeToFile();
        
        return "Success";
    }
    
    public void writeToFile() {
        
        file.delete();
        
        file = new File(PATH);
        
        try (PrintWriter pw = new PrintWriter( new FileWriter(file, true) )) {
            
            for (Notification notification : notifications.values()) {
                    pw.println(notification.toString()); 
            }
       
        } catch (IOException e) {
           
           System.out.println("I/O error: " + e.getMessage());           
        }
    }
    
}
