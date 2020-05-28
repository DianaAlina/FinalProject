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
public class Accounts {
    
    private final static String PATH = PDMSWebService.PATH + "accounts.txt";
    private File file = new File(PATH);
    
    private final HashMap<Integer,User> users = new HashMap<>();
    
    public Accounts() {
  
        try {
            file.createNewFile();
        } catch (IOException e) {
             System.out.println("I/O error:  " + e.getMessage());
        }
         
        readUsers();
    }
    
    public boolean isUser(String username) {
                
        for (User user : users.values()) {
            if (user.getUsername().equals(username)) return true;
        }
        
        return false;
    }
    
    public String logIn(String username, String password) {
                
        if (!isUser(username)) return "User not found";
        
        User user = findUserByUsername(username);
        
        if (user.getPassword().equals(password)) {
            
            return "Success";
            
        } else {
            
            return "Incorrect password";
        }
    }
    
    public User findUserByUsername(String username) {
                
        for (User user : users.values()) {
            if (user.getUsername().equals(username)) return user;
        }
        
        return null;
    }
    
    public User findUserByID(int id) {
        
        return users.get(id);
    }
    
    public User[] getAllUsers() {
        
        return users.values().toArray(new User[0]);
    }
    
    public User[] getAllCandidates() {
        
        ArrayList<User> result = new ArrayList();
        
        for (User user : users.values()) {
            if (user.getType() == User.CANDIDATE) result.add(user);
        }
        
        return result.toArray(new User[0]);
    }
    
    public User[] getAllVoters() {
        
        ArrayList<User> result = new ArrayList();
        
        for (User user : users.values()) {
            if (user.getType() == User.VOTER) result.add(user);
        }
        
        return result.toArray(new User[0]);
    }
    
    public String addUser(int type,
            String username, 
            String password,
            String name,
            Calendar birthdate,
            String organisation,
            String description) {
        
        if (findUserByUsername(username) != null) 
            return "Username already in use";
       
        if (type < 0 || type > 2) return "Provide a valid type";
        
        int id = getNextAvailableID();
        
        User user = new User(id,
            type,
            username, 
            password,
            name,
            birthdate,
            organisation,
            description
        );
        
        users.put(id, user);
        
        writeUsersToFile();
        
        return "Success";
    }
    
    private int getNextAvailableID() {
        
        Set<Integer> ids = users.keySet();
        
        int i = 0;
        while ( ids.contains(i) ) 
            i++;
        
        return i;
    }
    
    public void writeUsersToFile() {
        
        file.delete();
        
        file = new File(PATH);
        
        try (PrintWriter pw = new PrintWriter( new FileWriter(file, true) )) {
            
            for (User user : users.values()) {
                    pw.println(user.toString()); 
            }
       
        } catch (IOException e) {
           
           System.out.println("I/O error: " + e.getMessage());           
        }
    }
    
    private void readUsers() {
        
        try (BufferedReader reader = new BufferedReader( new FileReader(file))) {
            
            Gson gson = new Gson();
            
            String line;
            while ((line = reader.readLine()) != null) {
                
                User user = gson.fromJson(line, User.class);
                
                users.put(user.getId(), user);
            }
        
        } catch(IOException e) {
            
            System.out.println( "I/O error: " + e);
        }
    }
}
