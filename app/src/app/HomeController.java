package app;

import com.google.gson.Gson;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.User;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class HomeController implements Initializable {
    
    private User user;
    
    public Pane mainPane;
    
    @FXML public Tab tabLogOut;
    @FXML public AnchorPane apLogOut;
    @FXML public Button btnLogOut;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) { }
    
    public void setUsername(String username) { 
       
        btnLogOut.setText("Log out, " + username);
        
        String json = getUser(username);
        
        user = (new Gson()).fromJson(json, User.class);
        
        try {
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TabPane.fxml"));

            Pane pane = loader.load();
            
            TabController ctr = loader.getController();
            
            ctr.setUser(user);
            
            ctr.setParent(this);
            
            mainPane.getChildren().add(pane);

        } catch(Exception e){ e.printStackTrace(); }
    }
    
    public void backtoLogin(ActionEvent ac){
        
        try{

            Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage) ((Node) ac.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();

        } catch(Exception e){ e.printStackTrace(); }
        
    }
    
    public void changeMainPane(String resource) {
        
        try {
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));

            Pane pane = loader.load();
            
            HomePaneController ctr = loader.getController();
            
            ctr.setUser(user);
            
            ctr.setParent(this);
            
            mainPane.getChildren().add(pane);

        } catch(Exception e){ e.printStackTrace(); }
    }
    

    

    private static String registerUser(int type, java.lang.String username, java.lang.String password, java.lang.String name, javax.xml.datatype.XMLGregorianCalendar birthdate, java.lang.String organisation, java.lang.String description) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.registerUser(type, username, password, name, birthdate, organisation, description);
    }        
    
    private static String getUser(java.lang.String username) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getUser(username);
    }
}
