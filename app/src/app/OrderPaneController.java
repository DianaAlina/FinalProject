package app;

import com.google.gson.Gson;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.StagePDMS;
import model.User;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class OrderPaneController implements Initializable, HomePaneController {

    private HomeController parent;
    private User user;
    private StagePDMS stage;

    public AnchorPane apStock;
    public Button btnPlaceOrder;
    public TextField txtMaterials;
    public ChoiceBox supplier;

    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        
        User[] suppliers = (new Gson()).fromJson(getAllSuppliers(), User[].class);
        
        for (User user : suppliers) supplier.getItems().add(user.getUsername());
    }    

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void setParent(HomeController home) {
        parent = home;
    }
    
    public void setStage(StagePDMS stage) { this.stage = stage; }
    

    
    public void goHome(ActionEvent ac) { parent.changeMainPane("TabPane.fxml");}

    private static String getAllSuppliers() {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getAllSuppliers();
    }

    private static String createOrder(java.lang.String request, int stageID, int userID, int supplierID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.createOrder(request, stageID, userID, supplierID);
    }

    private static String getUser(java.lang.String username) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getUser(username);
    }
}
