package app;

import java.net.URL;
import java.net.URL;
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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class ChangePassController implements Initializable {

    public VBox vbChangePass;
    public Pane pChangePass;
    public TextField txtChangePass;
    public Button btnChangePass;
    public PasswordField pfNewChangePass;
    public Button btnBack;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {    }    
    
    public void changePassLog(ActionEvent event){
        LoginController lg = new LoginController();
        lg.forgotPassButtonAction(event);
    }
    
    
    @FXML
    public  void backtoLogChangePass(ActionEvent ac) {
        
        try{
            
            Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            Scene scene = new Scene(root);
            
            Stage window = (Stage) ((Node) ac.getSource()).getScene().getWindow();
            
            window.setScene(scene);
            window.show();
       
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    public void ChangePass(ActionEvent e) {
        
        try {
            String username = txtChangePass.getText();
            String newPassword = pfNewChangePass.getText();
            String result = changePassword(username, newPassword);
            if (result.equals("Success")){
                backtoLogChangePass(e);
            }
        } catch (Exception ee) {
            ee.printStackTrace();
            btnChangePass.setText("action not performed");
        }       
       
    }

    private static String changePassword(java.lang.String username, java.lang.String newPassword) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.changePassword(username, newPassword);
    }

    
    
}
