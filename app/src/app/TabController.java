package app;

import com.google.gson.Gson;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.Notification;
import model.Order;
import model.ServicePDMS;
import model.User;

/**
 *
 * @author diana
 */
public class TabController implements Initializable, HomePaneController {

    private HomeController parent;
    
    private User user;
    private ServicePDMS[] services;
    
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
    public CheckBox cbC1;
    public CheckBox cbC2;
    public CheckBox cbC3;
    public CheckBox cbC4;
    
    //Add Candidate tab
    public Tab tabAddCand;
    public AnchorPane apAddCand;
    public GridPane gpAddCand;
    public TextField tfName;
    public TextField tfOrganisation;
    public TextField tfDescription;
    public TextField tfUSername;
    public TextField tfPassword;
    public DatePicker dpUsDOB;
    public ChoiceBox cbType;
    public Button btnRegister;
    
    //Results tab
    public Tab tabResults;
    public AnchorPane apResults;
    public ListView lvResults;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        
        lvResults.setCellFactory(new Callback<ListView<Notification>, ListCell<Notification>>() {
            @Override
            public ListCell<Notification> call(ListView<Notification> param) {
                return new NotiCell();
            }
        });
    }
    
    @Override
    public void setUser(User user) {
        this.user = user;
               
        // Tab Add Candidate
        
        if (user.getType() == User.VOTER || user.getType() == User.CANDIDATE ) 
            tabAddCand.isDisabled();
        
        if (user.getType() == User.VOTER  || user.getType() == User.CANDIDATE )
            btnRegister.setVisible(false);
    }
    
    @Override
    public void setParent(HomeController home) { parent = home;  }
    
/*    public void bookService(ActionEvent ac) {
        
        parent.changeMainPane("BookServicePane.fxml");
    }
    
*/

    public void changePass(ActionEvent ac) {
        try{

            Parent root = FXMLLoader.load(getClass().getResource("ChangePass.fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage) ((Node) ac.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();

        } catch(Exception e){ e.printStackTrace(); }
    }
    
  /*  public void registerEmployee(ActionEvent ac) {
        parent.changeMainPane("RegUsPane.fxml");
    }*/
    
    private static String getServicesOfUser(int arg0) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getServicesOfUser(arg0);
    }

    private static String getNotificationsOfUser(int userID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getNotificationsOfUser(userID);
    }

    private static String getAllServices() {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getAllServices();
    }

    private static String getServicesOfSiteManager(int arg0) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getServicesOfSiteManager(arg0);
    }

    private static String getServicesOfWorker(int arg0) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getServicesOfWorker(arg0);
    }

    private static String getOrdersBySupplier(int supplierID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getOrdersBySupplier(supplierID);
    }

    private static String deliverOrder(int orderID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.deliverOrder(orderID);
    }
}
