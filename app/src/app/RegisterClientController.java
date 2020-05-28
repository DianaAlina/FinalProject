package app;

import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import model.User;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class RegisterClientController implements Initializable {
       
    private User user;
    
    public TextField username;
    public PasswordField password;
    public TextField name;
    public DatePicker date;
    public TextField organisation;
    public TextField description;
    
    public Button btnRegister;
    public Hyperlink signIn;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    public void registerNewUser(ActionEvent ac){
        
        try {
            String username1 = username.getText();
            String password1 = password.getText();
            String name1 = name.getText();
            LocalDate birthdate = date.getValue();
            GregorianCalendar gcal = GregorianCalendar.from(birthdate.atStartOfDay(ZoneId.systemDefault()));
            XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
            String organisation1 = organisation.getText();
            String description1 = description.getText();
            String result = registerUser(1, username1, password1, name1, xcal, organisation1, description1);            
            if (result.equals("Success")) {
                signinLogin(ac);
            } 
        } catch (Exception e) { e.printStackTrace(); }
    }

    private static String registerUser(int type, java.lang.String username, java.lang.String password, java.lang.String name, javax.xml.datatype.XMLGregorianCalendar birthdate, java.lang.String organisation, java.lang.String description) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.registerUser(type, username, password, name, birthdate, organisation, description, null, null);
    }
    
    @FXML
    public  void signinLogin(ActionEvent ac){ 
        
        try{

            Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage) ((Node) ac.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();

        } catch(Exception e){ e.printStackTrace(); }
    } 
}
