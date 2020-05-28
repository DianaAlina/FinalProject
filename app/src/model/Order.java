package model;

/**
 *
 * @author diana
 */
public class Order {
    
    private int id;
    private String request;
    private int stageID;
    private int userID;
    private int supplierID;
    private boolean delivered;
    
    public int getID() { return id; }
    
    public String getRequest() { return request; }
    
    public int getStageID() { return stageID; }
    
    public int getUserID() { return userID; }
    
    public int getSupplierID() { return supplierID; }
    
    public boolean delivered() { return delivered; }
}
