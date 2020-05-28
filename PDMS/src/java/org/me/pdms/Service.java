package org.me.pdms;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author diana
 */
public class Service {
    
    public static final int DEVELOPMENT = 0;
    public static final int REPAIR = 1;
    public static final int RENOVATION = 2;
    
    private final int id;
    private final int clientID;
    private int siteManagerID = -1;
    private final int type;
    private final String location;
    private int cost = 0;
    private final ArrayList<Integer> stagesID;
    private final Calendar startDate;    
    private boolean waitingForSiteManager = true;
    
    public Service(int id, int clientID, int type, String location, Calendar startDate) {
        this.stagesID = new ArrayList<>();
        
        this.id = id;
        this.clientID = clientID;
        this.type = type;
        this.location = location;
        this.startDate = startDate;
    }
    
    public String assignSiteManager(int siteManager) {
        
        if (!waitingForSiteManager) return "Site manager already assigned";
        
        Accounts accounts = new Accounts();
        
        User manager = accounts.findUserByID(siteManager);
        
        if (manager == null) return "Provide a valid user";
        
        if (manager.getType() != User.VOTER) 
            return "Provide a valid site manager";
        
        this.siteManagerID = siteManager;
        
        waitingForSiteManager = false;
        
        (new NotificationsList()).createNotification(
                siteManager, "You were assigned a new service");

        return "Success";
    }
    
    public String assignStage(int stageID) {     
    
        StagesList stages = new StagesList();
        
        if (!stages.isStage(stageID)) return "Provide valid stage id";

        Stage stage = stages.findStageByID(stageID);

        if (stage.getServiceID() != id) 
            return "Stage not belonging to this service";
            
        stagesID.add(stageID);
        
        return "Success";
    }
    
    public boolean isFinished() {
        
        Iterator<Integer> it = stagesID.iterator();
        
        while(it.hasNext()) {
            int stageID = it.next();
            
            StagesList stages = new StagesList();
        
            if (!stages.findStageByID(stageID).isFinished()) {
                return false;
            }
        }
        
        return true;
    }
    
    public void setCost(int cost) { 
        this.cost = cost;
        
        (new NotificationsList()).createNotification(
                clientID, "Your service has a new cost");
    }
    
    public int getID() { return id; }
    
    public int getClient() { return clientID; }
    
    public int getSiteManager() { return siteManagerID; }
    
    public int getType() { return type; }
    
    public String getLocation() { return location; } 
    
    public int getCost() { return cost; }
    
    public int[] getStagesID() { 
        int[] stages = new int[stagesID.size()];
        
        for (int i = 0; i < stages.length; i++) {
            stages[i] = stagesID.get(i);
        }
        
        return stages;
    }
    
    public boolean waitingForSiteManager() { return waitingForSiteManager; }
    
    @Override
    public String toString() { return (new Gson()).toJson(this); }
}
