package org.me.pdms;

import com.google.gson.Gson;
import java.util.Calendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author diana
 */
@WebService(serviceName = "PDMSWebService")
public class PDMSWebService {
       
    public final static String PATH = "/Users/diana/Documents/essproject-techie-tribe-master/PDMS/";
    
    private final Gson gson = new Gson();
    
    /****************
    * USERS METHODS *
    *****************/

    
    @WebMethod(operationName = "logIn")
    public String logIn(@WebParam(name = "username") String username,
            @WebParam(name = "password") String password) {
        
        Accounts accounts = new Accounts();
                
        return accounts.logIn(username, password);
    }
    
    @WebMethod(operationName = "registerUser")
    public String registerUser(
            @WebParam(name = "type") int type, 
            @WebParam(name = "username") String username, 
            @WebParam(name = "password") String password, 
            @WebParam(name = "name") String name,
            @WebParam(name = "birthdate") Calendar birthdate,
            @WebParam(name = "organisation") String organisation,
            @WebParam(name = "description") String description) {         
               
        Accounts accounts = new Accounts();
        return accounts.addUser(
                 type,
                 username,
                 password,
                 name,
                 birthdate,
                 organisation,
                 description
         );
    }
    
    @WebMethod(operationName = "getUser")
    public String getUser(@WebParam(name = "username") String username) {
        
        Accounts accounts = new Accounts();
        
        if(!accounts.isUser(username)) return "Provide valid username";
        
        return gson.toJson(accounts.findUserByUsername(username));
    }
    
    @WebMethod(operationName = "getUserByID")
    public String getUserByID(@WebParam(name = "userID") int id) {   
        Accounts accounts = new Accounts();
        return gson.toJson(accounts.findUserByID(id));
    }

    @WebMethod(operationName = "changePassword")
    public String changePassword(
            @WebParam(name = "username") String username,
            @WebParam(name = "newPassword") String newPassword) {
        
        Accounts accounts = new Accounts();
        
        if(!accounts.isUser(username)) return "Provide valid username";
        
        User user = accounts.findUserByUsername(username);
        
        String status = user.changePassword(newPassword);
        
        accounts.writeUsersToFile();
        
        return status;
    }
    
    @WebMethod(operationName = "getAllUsers")
    public String getAllUsers() {
        Accounts accounts = new Accounts();
        return gson.toJson(accounts.getAllUsers());
    }
    
    @WebMethod(operationName = "getAllSiteCandidates")
    public String getAllCandidates() {
        Accounts accounts = new Accounts();
        return gson.toJson(accounts.getAllCandidates());
    }
    
    @WebMethod(operationName = "getAllVoters")
    public String getAllVoters() {
        Accounts accounts = new Accounts();
        return gson.toJson(accounts.getAllVoters());
    }
}

