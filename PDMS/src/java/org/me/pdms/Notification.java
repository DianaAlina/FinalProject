package org.me.pdms;

import com.google.gson.Gson;

/**
 *
 * @author diana
 */
public class Notification {
    
    private final int id;
    private final int userID;
    private final String message;
    private boolean seen = false;
    
    public Notification(int id, int userID, String message) {
        this.id = id;
        this.userID = userID;
        this.message = message;
    }
    
    public String discardNotification() { seen = true; return "Success"; }
    
    public int getID() { return id; }
    
    public int getUserID() { return userID; }
    
    public String getMessage() { return message; }
    
    public boolean seen() { return seen; }
    
    @Override
    public String toString() { return (new Gson()).toJson(this); }
}
