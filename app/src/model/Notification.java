package model;

/**
 *
 * @author diana
 */
public class Notification {
    
    private int id;
    private int userID;
    private String message;
    private boolean seen;
    
    public int getID() { return id; }
    
    public int getUserID() { return userID; }
    
    public String getMessage() { return message; }
    
    public boolean seen() { return seen; }
}
