package org.me.pdms;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author diana
 */
public class ServicesList {
    
    private static final String PATH = PDMSWebService.PATH + "services.txt";
    
    private File file = new File(PATH);
    
    private final HashMap<Integer,Service> services = new HashMap();
    
    public ServicesList() {
        
        try {
            file.createNewFile();
        } catch (IOException e) {
             System.out.println("I/O error:  " + e.getMessage());
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            Gson gson = new Gson();
            
            String line = reader.readLine();
            
            while(line != null) {
                
                Service service = gson.fromJson(line, Service.class);
                
                services.put(service.getID(), service);
                
                line = reader.readLine();
            }
            
        } catch (IOException e ) {
            
            System.out.println("I/O error:  " + e.getMessage());
        }
    }
    
    private int getNextAvailableID() {
        
        Set<Integer> ids = services.keySet();
        
        int i = 0;
        while ( ids.contains(i) ) 
            i++;
        
        return i;
    }
    
    public String createService(int clientID, int type, String location, Calendar startDate) {
        
        if (type < 0 || type > 2) return "Provide a valid service type";
        
        Accounts accounts = new Accounts();
        
        User client = accounts.findUserByID(clientID);
        
        if (client.getType() != User.VOTER) return "Provide a valid client id";
        
        int id = getNextAvailableID();
        
        Service service = new Service(id, clientID, type, location, startDate);
        
        services.put(id, service);
        
        writeToFile();
        
        return "Success";
    }
    
    public Service[] getAllServices() {
        return services.values().toArray(new Service[0]);
    }
    
    public Service[] getServicesOfUser(int clientID) {
        
        ArrayList<Service> list = new ArrayList<>();
        
        for (Service service : services.values()) {
            if (service.getClient() == clientID) list.add(service);
        }
        
        return list.toArray(new Service[0]);
    }
    
    public Service[] getServicesOfSiteManager(int siteManagerID) {
        
        ArrayList<Service> list = new ArrayList<>();
        
        for (Service service : services.values()) {
            if (service.getSiteManager() == siteManagerID) list.add(service);
        }
        
        return list.toArray(new Service[0]);
    }
    
    public Service[] getServicesOfWorker(int workerID) {
        
        ArrayList<Service> list = new ArrayList<>();
        
        StagesList stagesList = new StagesList();
        
        for (Service service : services.values()) {
            
            int[] stages = service.getStagesID();
            
            for (int stageID : stages) {
                
                Stage s = stagesList.findStageByID(stageID);
                
                if (s.isWorker(workerID)) {
                    
                    list.add(service);
                    break;
                }
            }
        }
        
        return list.toArray(new Service[0]);
    }
    
    public Service findServiceByID(int id) {
        
        return services.get(id);
    }
    
    public boolean isService(int id) {
        
        return services.containsKey(id);
    }
    
    public void writeToFile() {
        
        file.delete();
        
        file = new File(PATH);
        
        try (PrintWriter pw = new PrintWriter( new FileWriter(file, true) )) {
            
            for (Service service : services.values()) {
                    pw.println(service.toString()); 
            }
       
        } catch (IOException e) {
           
           System.out.println("I/O error: " + e.getMessage());           
        }
    }

}
