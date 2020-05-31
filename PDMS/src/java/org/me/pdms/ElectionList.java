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
public class ElectionList {
    
    private final static String PATH = PDMSWebService.PATH + "elections.txt";
    
    private File file = new File(PATH);
    
    private final HashMap<Integer,Election> elections = new HashMap();
    
    public ElectionList() {
        
        try {
            file.createNewFile();
        } catch (IOException e) {
             System.out.println("I/O error:  " + e.getMessage());
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            Gson gson = new Gson();
            
            String line = reader.readLine();
            
            while(line != null) {
                
                Election election = gson.fromJson(line, Election.class);
                
                elections.put(election.getID(), election);
                
                line = reader.readLine();
            }
            
        } catch (IOException e ) {
            
            System.out.println("I/O error:  " + e.getMessage());
        }
    }
    
    private int getNextAvailableID() {
        
        Set<Integer> ids = elections.keySet();
        
        int i = 0;
        while ( ids.contains(i) ) 
            i++;
        
        return i;
    }
    
    public String createElection(String desc, String can1, String can2, String can3, String can4, String status) {
        
        ElectionList elections1 = new ElectionList();
        
        int id = getNextAvailableID();
        
        Election election = new Election(id, desc, can1, can2, can3, can4, status);
        
        elections.put(id, election);
         
        writeToFile();
        
        return "Success";
    }
 

    
    public void writeToFile() {
        
        file.delete();
        
        file = new File(PATH);
        
        try (PrintWriter pw = new PrintWriter( new FileWriter(file, true) )) {
            
            for (Election election : elections.values()) {
                    pw.println(election.toString()); 
            }
       
        } catch (IOException e) {
           
           System.out.println("I/O error: " + e.getMessage());           
        }
    }
    
    
    
}

