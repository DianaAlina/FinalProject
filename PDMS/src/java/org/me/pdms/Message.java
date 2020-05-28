package org.me.pdms;

import com.google.gson.Gson;

/**
 *
 * @author diana
 */
public class Message {
    
    private final int id;
    private final int stageID;
    private final int userID;
    private final String text;
    
    public Message(int id, int stageID, int userID, String text) {
        this.id = id;
        this.stageID = stageID;
        this.userID = userID;
        this.text = text;
        
        
    }
    
    public int getID() { return id; }
    
    public int getStageID() { return stageID; }
    
    public int getUserID() { return userID; }
    
    public String getText() { return text; }
    
    @Override
    public String toString() { return (new Gson()).toJson(this); }
}
