package org.me.pdms;

import com.google.gson.Gson;

/**
 *
 * @author diana
 */
public class Order {
    
    private final int id;
    private final String request;
    private final int stageID;
    private final int userID;
    private final int supplierID;
    private boolean delivered;
    
    public Order(int id, String request, int stageID, int userID, int supplierID) {
        this.delivered = false;
        this.id = id;
        this.request = request;
        this.stageID = stageID;
        this.userID = userID;
        this.supplierID = supplierID;
    }
    
    public String deliver() {
        
        if (delivered) return "Order already delivered";
        
        delivered = true;
        
        (new StagesList()).findStageByID(stageID).notifyWorkers(
            "An order has been delivered");
        
        return "Success";
    }
    
    public int getID() { return id; }
    
    public String getRequest() { return request; }
    
    public int getStageID() { return stageID; }
    
    public int getUserID() { return userID; }
    
    public int getSupplierID() { return supplierID; }
    
    public boolean delivered() { return delivered; }
    
    @Override
    public String toString() { return (new Gson()).toJson(this); }
}
