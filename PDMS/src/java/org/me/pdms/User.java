package org.me.pdms;

import com.google.gson.Gson;
import java.util.Calendar;

/**
 *
 * @author diana
 */
public class User {
    
    public final static int ADMIN = 0;
    public final static int VOTER = 1;
    public final static int CANDIDATE = 2;
    
    private final int id;
    private final int type;
    private final String username;
    private String password;
    private final String name;
    private final Calendar birthdate;
    private final String organisation;
    private final String description;
    
    
    public User (
            int id,
            int type,
            String username, 
            String password,
            String name,
            Calendar birthdate,
            String organisation,
            String description) {
        this.id = id;
        this.type = type;
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthdate = birthdate;
        this.organisation = organisation;  
        this.description = description;
    }
        
    public int getId() { return id; }
    
    public int getType() { return type; }
    
    public String getUsername() { return username; }
    
    public String getPassword() { return password; }
    
    public String getName() { return name; }
    
    public Calendar getBirthdate() { return birthdate; }
    
    public String getOrganisation() { return organisation; }
    
    public String getDescription() {return description;}
    
    public String changePassword(String newPassword) {
        this.password = newPassword;
        
        return "Success";
    }
    
    @Override
    public String toString() { return (new Gson()).toJson(this); }    
}
