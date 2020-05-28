package org.me.pdms;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author diana
 */
public class Stage {
    
    public static final String[] STAGE_NAMES = {
        "Planning permission", 
        "Floor plan", 
        "Foundation", 
        "Concrete walls and forms", 
        "Utilities", 
        "Framing and windows", 
        "Roofing", 
        "Plumbing", 
        "Interior",
        "Exterior"};
    
    public static final int PLANNING_PERMISSION = 0;
    public static final int FLOOR_PLAN = 1;
    public static final int FOUNDATION = 2;
    public static final int CONCRETE_WALLS_AND_FORMS = 3;
    public static final int UTILITIES = 4;
    public static final int FRAMING_AND_WINDOWS = 5;
    public static final int ROOFING = 6;
    public static final int PUMBLING = 7;
    public static final int INTERIOR= 8;
    public static final int EXTERIOR = 9;
    
    private final int id;
    private final int serviceID;
    private final String name;
    private boolean finished = false;
    private final ArrayList<Integer> workersID;
    
    public Stage(int id, int serviceID, int name) {
        this.workersID = new ArrayList<>();
        this.id = id;
        this.serviceID = serviceID;
        this.name = STAGE_NAMES[name];
    }
    
    public String assignWorker(int worker) {
        
        Accounts accounts = new Accounts();
        
        User user = accounts.findUserByID(worker);
        
        if (user == null) return "Provide a valid user";
        
        if (user.getType() != User.VOTER) return "Provide a valid worker";
        
        workersID.add(worker);
        
        (new NotificationsList()).createNotification(
                worker, "You have been assigned to a stage");
        
        return "Success";
    }
    
    public String finish() {
        
        finished = true;
        
        notifyAllUsers("The stage " + name + " has finished"); 
        
        return "Success";
    }
    
    public void notifyAllUsers(String message) {
        
        Service service = (new ServicesList()).findServiceByID(serviceID);
        
        NotificationsList notify = new NotificationsList();
        
        notify.createNotification(service.getClient(), message);

        notify.createNotification(service.getSiteManager(), message);
        
        workersID.forEach((workerID) -> {
            notify.createNotification(workerID, message);
        });
    }
    
    public void notifyWorkers(String message) {
        
        Service service = (new ServicesList()).findServiceByID(serviceID);
        
        NotificationsList notify = new NotificationsList();

        notify.createNotification(service.getSiteManager(), message);
        
        workersID.forEach((workerID) -> {
            notify.createNotification(workerID, message);
        });
    }
    
    public boolean isWorker(int workerID) {
        
        return workersID.contains(workerID);
    }
    
    public int getID() { return id; }
    
    public int getServiceID() { return serviceID; }
    
    public String getName() { return name; }
    
    public int[] getWorkers() { 
        int[] workers = new int[workersID.size()];
        
        for (int i = 0; i < workers.length; i++) {
            workers[i] = workersID.get(i);
        }
        
        return workers;
    }
    
    public boolean isFinished() { return finished; }
    
    @Override
    public String toString() { return (new Gson()).toJson(this); }
}
