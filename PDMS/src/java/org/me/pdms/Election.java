package org.me.pdms;

import com.google.gson.Gson;
import java.io.IOException;

/**
 *
 * @author diana
 */
public class Election {
    
    private final int id;
    private final String description;
    private final String can1;
    private final String can2;
    private final String can3;
    private final String can4;
    private final String status;
    
    public Election(int id, String description, String can1, String can2, String can3, String can4, String status) {
        this.id = id;
        this.description = description;
        this.can1 = can1;
        this.can2 = can2;
        this.can3 = can3;
        this.can4 = can4;
        this.status = status;
        
    }
    
    public int getID() { return id; }
    
    public String getDescription() { return description; }
    
    public String getCan1() { return can1; }
    
    public String getCan2() { return can2; }
    
    public String getCan3() { return can3; }
    
    public String getCan4() { return can4; }
    
    public String getStatus() {return status; }
    
    @Override
    public String toString() { return (new Gson()).toJson(this); }
}
