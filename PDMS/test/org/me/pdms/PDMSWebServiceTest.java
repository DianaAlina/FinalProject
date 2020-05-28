package org.me.pdms;

import com.google.gson.Gson;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
/**
 *
 * @author diana
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PDMSWebServiceTest {
    
    private final PDMSWebService service = new PDMSWebService();
    private final Gson gson = new Gson();
    
    public PDMSWebServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        String path = "";
        
        File file = new File(path + "accounts.txt");
        file.delete();
        
    }
    
    @After
    public void tearDown() {
        System.out.println("***");
    }

    /**
     * Test of registerUser method, of class PDMSWebService.
     */
    @Test
    public void atestRegisterUser() {
        int type = User.VOTER;
        String username = "dianaVoter";
        String password = "password";
        String name = "Diana-Alina-V";
        Calendar birthdate = new GregorianCalendar(1998, Calendar.AUGUST, 4);
        String organisation = "university";
        String description = "SE student";
        
        String expResult = "Success";
        String result = service.registerUser(type, username, password, name, 
                birthdate, organisation, description);
        System.out.println("Registering user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
        
        expResult = "Username already in use";
        result = service.registerUser(type, username, password, name, 
                birthdate, organisation, description);
        System.out.println("Registering user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
        
        username = "dianaCandidate";
        password = "candidate";
        name = "Diana-Alina-C";
        type = User.CANDIDATE;
        organisation = "Company";
        expResult = "Success";
        result = service.registerUser(type, username, password, name, 
                birthdate, organisation,description);
        System.out.println("Registering user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
        
        username = "dianaAdmin";
        password = "admin";
        name = "Diana-Alina-A";
        type = User.ADMIN;
        organisation = "Company";
        expResult = "Success";
        result = service.registerUser(type, username, password, name, 
                birthdate, organisation, description);
        System.out.println("Registering user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
    }
   
    /**
     * Test of logIn method, of class PDMSWebService.
     */ 
    @Test
    public void btestLogIn() {
                
        String username = "user";
        String password = "pass";    
        
        String expResult = "User not found";
        String result = service.logIn(username, password);
        System.out.println("Login user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
        
        username = "dianaCandidate";     
        expResult = "Incorrect password";
        result = service.logIn(username, password);
        System.out.println("Login user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
        
        password = "candidate";
        expResult = "Success";
        result = service.logIn(username, password);
        System.out.println("Login user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
        
        username = "dianaCandidate";
        password = "candidate";
        expResult = "Success";
        result = service.logIn(username, password);
        System.out.println("Login user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getUser method, of class PDMSWebService.
     */
    @Test
    public void ctestGetUser() {

        String username = "dianaCandidate";
        String password = "candidate";
        String name = "Diana-Alina-C";
        int type = User.CANDIDATE;
        Calendar birthdate = new GregorianCalendar(1998, Calendar.AUGUST, 4);
        String organisation="Company";
        String description="SE student";
 
        
        User user = new User(1, type, username, password, name, birthdate, organisation, description);
        
        String expResult = gson.toJson(user);
        String result = service.getUser(username);
        System.out.println("Getting user " + username + " result -> " + result);
        assertEquals(expResult, result);
        
        username = "andy";
        expResult = "Provide valid username";
        result = service.getUser(username);
        System.out.println("Getting user " + username + " result -> " + result);
        assertEquals(expResult, result);
    }

    /**
     * Test of changePassword method, of class PDMSWebService.
     */
    @Test
    public void dtestChangePassword() {
        System.out.println("Changing password: ");
        
        String username = "user";
        String newPassword = "newPassword";
        String expResult = "Provide valid username";
        String result = service.changePassword(username, newPassword);
        System.out.println("Username:" + username + " newPassword:" + newPassword + " -> " + result);
        assertEquals(expResult, result);
        
        username = "dianaCandidate";
        newPassword = "newPassword";
        expResult = "Success";
        result = service.changePassword(username, newPassword);
        System.out.println("Username:" + username + " newPassword:" + newPassword + " -> " + result);
        assertEquals(expResult, result);
        
        username = "dianaCandidate";
        String password = "password";
        expResult = "Incorrect password";
        result = service.logIn(username, password);
        System.out.println("Login user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
        
        username = "dianaCandidate";
        password = "newPassword";
        expResult = "Success";
        result = service.logIn(username, password);
        System.out.println("Login user:" + username + " password:" + password + " -> " + result);
        assertEquals(expResult, result);
    }

    
}
