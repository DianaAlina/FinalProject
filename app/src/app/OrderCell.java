package app;

import com.google.gson.Gson;
import model.ServicePDMS;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import model.Order;
import model.StagePDMS;

/**
 *
 * @author diana
 */
public class OrderCell extends ListCell<Order> {
    
    public Label request;
    public Label loc;
        
    public OrderCell() {
        loadFXML();
    }
    
    private void loadFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("order_cell.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    protected void updateItem(Order order, boolean empty) {
        super.updateItem(order, empty);
        
        if (empty) {
            setText(null);
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        
        } else {
            
            request.setText(order.getRequest());
            
            Gson gson = new Gson();
            
            StagePDMS stage = gson.fromJson(getStage(order.getStageID()), StagePDMS.class);
            
            ServicePDMS service = gson.fromJson(getService(stage.getServiceID()), ServicePDMS.class);
            
            loc.setText(service.getLocation());
            
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
    }

    private static String getStage(int stageID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getStage(stageID);
    }

    private static String getService(int serviceID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getService(serviceID);
    }    
}
