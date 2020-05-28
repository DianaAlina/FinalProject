package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author diana
 */
public class ServicePDMS {
    
    public static final String[] typeName = {"Development", "Repair", "Renovation"};
 
    public static final int DEVELOPMENT = 0;
    public static final int REPAIR = 1;
    public static final int RENOVATION = 2;
    
    private int id;
    private int clientID;
    private int siteManagerID;
    private int type;
    private String location;
    private int cost;
    private ArrayList<Integer> stagesID;
    private Calendar startDate;    
    private boolean waitingForSiteManager;

    public int getID() { return id; }
    
    public int getClient() { return clientID; }
    
    public int getSiteManager() { return siteManagerID; }
    
    public String getLocation() { return location; }
    
    public int getCost() { return cost; }
    
    public int getType() { return type; }
    
    public int[] getStagesID() { 
        int[] stages = new int[stagesID.size()];
        
        for (int i = 0; i < stages.length; i++) {
            stages[i] = stagesID.get(i);
        }
        
        return stages;
    }
    
    public Calendar getStartDate() { return startDate; }
    
    public boolean waitingForSiteManager() { return waitingForSiteManager; }
}
