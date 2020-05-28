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
public class MessagesList {
    
    private final static String PATH = PDMSWebService.PATH + "messages.txt";
    
    private File file = new File(PATH);
    
    private final HashMap<Integer,Message> messages = new HashMap();
    
    public MessagesList() {
        
        try {
            file.createNewFile();
        } catch (IOException e) {
             System.out.println("I/O error:  " + e.getMessage());
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            Gson gson = new Gson();
            
            String line = reader.readLine();
            
            while(line != null) {
                
                Message message = gson.fromJson(line, Message.class);
                
                messages.put(message.getID(), message);
                
                line = reader.readLine();
            }
            
        } catch (IOException e ) {
            
            System.out.println("I/O error:  " + e.getMessage());
        }
    }
    
    private int getNextAvailableID() {
        
        Set<Integer> ids = messages.keySet();
        
        int i = 0;
        while ( ids.contains(i) ) 
            i++;
        
        return i;
    }
    
    public String createMessage(int stageID, int userID, String text) {
        
        StagesList stages = new StagesList();
        
        if (!stages.isStage(stageID)) return "Provide valid stage";
        
        User user = (new Accounts()).findUserByID(userID);
        
        if (user == null) return "Provide a valid user";
               
        int id = getNextAvailableID();
        
        Message message = new Message(id, stageID, userID, text);
        
        messages.put(id, message);
        
        stages.findStageByID(stageID).notifyAllUsers("You have a new message");
        
        writeToFile();
        
        return "Success";
    }
    
    public Message findMessageByID(int id) {
        
        return messages.get(id);
    }
    
    public Message[] findMessagesOfStage(int stageID) {
        
        ArrayList<Message> list = new ArrayList<>();

        for (Message message : messages.values()) {
         
            if (message.getStageID() == stageID) list.add(message);
        }
        
        return list.toArray(new Message[0]);
        
    }
    
    public Message[] getAllMessages() {
        return messages.values().toArray(new Message[0]);
    }
    
    public boolean isMessage(int id) {
        
        return messages.containsKey(id);
    }
    
    public void writeToFile() {
        
        file.delete();
        
        file = new File(PATH);
        
        try (PrintWriter pw = new PrintWriter( new FileWriter(file, true) )) {
            
            for (Message message : messages.values()) {
                    pw.println(message.toString()); 
            }
       
        } catch (IOException e) {
           
           System.out.println("I/O error: " + e.getMessage());           
        }
    }
    
}

