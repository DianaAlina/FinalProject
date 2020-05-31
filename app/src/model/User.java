package model;

import java.util.Calendar;

/**
 *
 * @author diana
 */
public class User {
    
    public final static String[] TYPES = {"Admin", "Voter", "Candidate"};
    
    public final static int ADMIN = 0;
    public final static int VOTER = 1;
    public final static int CANDIDATE = 2;

    
    private int id;
    private int type;
    private String username;
    private String password;
    private String name;
    private Calendar birthdate;
    private String organisation;
    private String description;
    
    public int getId() { return id; }
    
    public int getType() { return type; }
    
    public String getUsername() { return username; }
    
    public String getPassword() { return password; }
    
    public String getName() { return name; }
    
    public Calendar getBirthdate() { return birthdate; }
    
    public String getOrganisation() {return organisation; }
    
    public String getDescription() {return description; }
    
}
