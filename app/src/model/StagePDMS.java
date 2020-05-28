package model;

import java.util.ArrayList;

/**
 *
 * @author diana
 */
public class StagePDMS {
    
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
    
    private int id;
    private int serviceID;
    private String name;
    private boolean finished;
    private ArrayList<Integer> workersID;
    
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
}
