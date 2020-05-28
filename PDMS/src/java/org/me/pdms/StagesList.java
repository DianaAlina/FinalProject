package org.me.pdms;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author diana
 */
public class StagesList {
    
    private final static String PATH = PDMSWebService.PATH + "stages.txt";
    
    private File file = new File(PATH);
    
    private final HashMap<Integer,Stage> stages = new HashMap();
    
     public StagesList() {
         
        try {
            file.createNewFile();
        } catch (IOException e) {
             System.out.println("I/O error:  " + e.getMessage());
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            Gson gson = new Gson();
            
            String line = reader.readLine();
            
            while(line != null) {
                
                Stage stage = gson.fromJson(line, Stage.class);
                
                stages.put(stage.getID(), stage);
                
                line = reader.readLine();
            }
            
        } catch (IOException e ) {
            
            System.out.println("I/O error:  " + e.getMessage());
        }
    }
         
    public int getNextAvailableID() {
        
        Set<Integer> ids = stages.keySet();
        
        int i = 0;
        while ( ids.contains(i) ) 
            i++;
        
        return i;
    }
    
    public String createStage(int serviceID, int name) {
        
        ServicesList services = new ServicesList();
        
        if (!services.isService(serviceID)) return "Provide a valid service id";
        
        if ( name < 0 || name > Stage.STAGE_NAMES.length-1) {
            
            return "Provide a valid name";
        }
        
        int id = getNextAvailableID();
        
        Stage stage = new Stage(id, serviceID, name);
        
        stages.put(id, stage);
        
        writeToFile();
        
        return "Success";
    }
    
    public Stage[] getAllStages() {
        return stages.values().toArray(new Stage[0]);
    }
    
    public Stage findStageByID(int id) {
        
        return stages.get(id);
    }
    
    public boolean isStage(int id) {
        
        return stages.containsKey(id);
    }
    
    public void writeToFile() {
        
        file.delete();
        
        file = new File(PATH);
        
        try (PrintWriter pw = new PrintWriter( new FileWriter(file, true) )) {
            
            for (Stage stage : stages.values()) {
                    pw.println(stage.toString()); 
            }
       
        } catch (IOException e) {
           
           System.out.println("I/O error: " + e.getMessage());           
        }
    }

}
