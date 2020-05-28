/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;
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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
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

public class LoginController implements Initializable {

    public TextField txtEmailUnameLogin;
    public Button btnLogin;
    public Hyperlink hlSignLogin;
    public Hyperlink hlForgotPassLogin;
    public PasswordField pfPassLogin;
    public Label loginStatus;
    
    @FXML
    public void logInButtonAction(ActionEvent event) {
       
        String username = txtEmailUnameLogin.getText();
        String password = pfPassLogin.getText();

        String result = logIn(username, password);
        
        loginStatus.setVisible(true);
        loginStatus.setText(result);

        if (result.equals("Success")) {
            
            try{
                
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
                
                Parent root = loader.load();
                HomeController controller = loader.getController();
                controller.setUsername(username);
                Scene scene = new Scene(root);

                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                window.setScene(scene);
                window.show();

            } catch(Exception e){ e.printStackTrace(); }
        }

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        loginStatus.setVisible(false);
    }    
    
    @FXML
    public void registerButtonAction(ActionEvent event) throws IOException {
                
        try{
            
            Parent root = FXMLLoader.load(getClass().getResource("RegisterClient.fxml"));
            Scene scene = new Scene(root);
            
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            window.setScene(scene);
            window.show();
       
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @FXML
    public void forgotPassButtonAction(ActionEvent event){
        
        try{
            
            Parent root = FXMLLoader.load(getClass().getResource("ChangePass.fxml"));
            Scene scene = new Scene(root);
            
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            window.setScene(scene);
            window.show();
       
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }

    private static String logIn(java.lang.String username, java.lang.String password) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.logIn(username, password);
    } 
}
