package app;

import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import model.User;
/**
 * FXML Controller class
 *
 * @author diana
 */
public class RegisterController implements Initializable, HomePaneController {

    private HomeController parent;
    private User user;
    
    @FXML
    private Button btnRegisterUser;
    @FXML
    private TextField txtUsName;
    @FXML
    private TextField txtUsOrganisation;
    @FXML
    private TextField txtUsDescription;
    @FXML
    private TextField txtUsUsername;
    @FXML
    private TextField txtUsPassword;
    @FXML
    private DatePicker dpUsDOB;
    @FXML
    private ChoiceBox<String> txtUsType;
    @FXML
    private Button btnBackUs;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        txtUsType.getItems().add(User.TYPES[User.VOTER]);
        txtUsType.getItems().add(User.TYPES[User.CANDIDATE]);
        
    }    

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void setParent(HomeController home) {
        parent = home;
    }
    
    public void registerEmp(ActionEvent ac) {
        
        try {
            int type = txtUsType.getSelectionModel().getSelectedIndex()+1;
            String username = txtUsUsername.getText();
            String password = txtUsPassword.getText();
            String name = txtUsName.getText();
            LocalDate birthdate = dpUsDOB.getValue();
            GregorianCalendar gcal = GregorianCalendar.from(birthdate.atStartOfDay(ZoneId.systemDefault()));
            XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
            String organisation = txtUsOrganisation.getText();
            String description = txtUsDescription.getText();

           
            String result = registerUser(type, username, password, name, 
                    xcal,
                    organisation, description);
            
            if (result.equals("Success")) {
                parent.changeMainPane("TabPane.fxml");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            btnRegisterUser.setText("action not performed");
        }       
    }
    
    public void goBack(ActionEvent ac) {
        parent.changeMainPane("TabPane.fxml");
    }

    private static String registerUser(int type, java.lang.String username, java.lang.String password, java.lang.String name, javax.xml.datatype.XMLGregorianCalendar birthdate, java.lang.String organisation, java.lang.String description){
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.registerUser(type, username, password, name, birthdate, organisation, description, null, null);
    }

}
