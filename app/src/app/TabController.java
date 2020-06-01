package app;

import com.google.gson.Gson;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import model.User;

/**
 *
 * @author diana
 */
public class TabController implements Initializable, HomePaneController {

    private HomeController parent;
    
    private User user;
    
    //Elections tab
    public Tab tabElections;
    public AnchorPane apElections;
    public Text tElectionDesc;
    public Text tC1;
    public Text tC2;
    public Text tC3;
    public Text tC4;
    public Button btnVoteC1;
    public Button btnVoteC2;
    public Button btnVoteC3;
    public Button btnVoteC4;
    public Button btnStop;
    
    //Create Election tab
    public Tab tabCreateElec;
    public AnchorPane apCreateElec;
    public Button btnCreateElec;
    public TextArea taCreateDesc;
    public ChoiceBox cbC1;
    public ChoiceBox cbC2;
    public ChoiceBox cbC3;
    public ChoiceBox cbC4;
    
    //Add User tab
    public Tab tabAddUs;
    public AnchorPane apAddUs;
    public GridPane gpAddUs;
    public TextField tfName;
    public TextField tfOrganisation;
    public TextField tfDescription;
    public TextField tfUsername;
    public TextField tfPassword;
    public DatePicker dpUsDOB;
    public ChoiceBox cbType;
    public Button btnRegister;
    
    //Results tab
    public Tab tabResults;
    public AnchorPane apResults;
    public ListView lvResults;
    
    //Profile tab
    public Tab tabProfile;
    public AnchorPane apProfile;
    public Button btnChangePass;
    public Text tName;
    public Text tType;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      
        cbType.getItems().add(User.TYPES[User.VOTER]);
        cbType.getItems().add(User.TYPES[User.CANDIDATE]);
        
        User[] candidates = (new Gson()).fromJson(getAllCandidates(), User[].class);

            for (User user : candidates) {
               
                    cbC1.getItems().add(user.getName());
                    cbC2.getItems().add(user.getName());
                    cbC3.getItems().add(user.getName());
                    cbC4.getItems().add(user.getName());
                } 
    }
    
 
    
    @Override
    public void setUser(User user) {
        this.user = user;
               
        // Tab Create election and Add user 
        
        
        if (user.getType() == User.VOTER || user.getType() == User.CANDIDATE ) {
            tabAddUs.setDisable(true);
            tabCreateElec.setDisable(true);
            btnStop.setVisible(false);
            tName.setText(user.getName());
            if (user.getType() == User.VOTER)
                tType.setText("VOTER");
            else if (user.getType() == User.CANDIDATE){
                tType.setText("CANDIDATE");
                btnVoteC1.setVisible(false);
                btnVoteC2.setVisible(false);
                btnVoteC3.setVisible(false);
                btnVoteC4.setVisible(false);
            }
        }
        else {
            tabAddUs.setDisable(false);
            tabCreateElec.setDisable(false);
            btnStop.setVisible(true);
            
            tName.setText(user.getName());
            tType.setText("ADMIN");
        }
        
        
    }
    
    @Override
    public void setParent(HomeController home) { parent = home;  }


    public void changePass(ActionEvent ac) {
        try{

            Parent root = FXMLLoader.load(getClass().getResource("ChangePass.fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage) ((Node) ac.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();

        } catch(Exception e){ e.printStackTrace(); }
    }
   
        @FXML
    public void registerUs(ActionEvent ac) {
        
        try {
            int type = 0;
            String getUserType = (String) cbType.getValue();
            if ("Voter".equals(getUserType)){
                type = 1;
            }
            else if ("Candidate".equals(getUserType)){
                type = 2;
            }
            //int type = cbType.getSelectionModel().getSelectedIndex()+1;
            String username = tfUsername.getText();
            String password = tfPassword.getText();
            String name = tfName.getText();
            LocalDate birthdate = dpUsDOB.getValue();
            GregorianCalendar gcal = GregorianCalendar.from(birthdate.atStartOfDay(ZoneId.systemDefault()));
            XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
            String organisation = tfOrganisation.getText();
            String description = tfDescription.getText();

           
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
            btnRegister.setText("action not performed");
        }       
    }
    @FXML
    public void createElec(ActionEvent ac){
        try{ String desc = taCreateDesc.getText();
        String can1 = (String) cbC1.getValue();
        String can2 = (String) cbC2.getValue();
        String can3 = (String) cbC3.getValue();
        String can4 = (String) cbC4.getValue();
        String status = "START";
        
        String res = createElection(desc, can1, can2, can3, can4, status);
        
        if (res.equals("Success")){
            btnCreateElec.setText("election created");
        }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            btnCreateElec.setText("action not performed");
        }     
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

    private static String getAllCandidates() {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getAllCandidates();
    }

    private static String createElection(java.lang.String desc, java.lang.String can1, java.lang.String can2, java.lang.String can3, java.lang.String can4, java.lang.String status) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.createElection(desc, can1, can2, can3, can4, status);
    }

    
   
}
