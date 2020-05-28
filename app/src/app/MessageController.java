package app;

import com.google.gson.Gson;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.util.Callback;
import model.Message;
import model.ServicePDMS;
import model.StagePDMS;
import model.User;

/**
 *
 * @author diana
 */
public class MessageController implements Initializable, HomePaneController{

    private HomeController parent;
    private User user;
    private StagePDMS stage;
    
    public Label stageName;
    public Button placeOrder;
    public Hyperlink back;
    public Hyperlink home;
    public ListView lvMessages;
    public TextField txtCreateMessage;
    public Button btnSendMessage;
    public ChoiceBox workers;
    public Button addWorker;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
        lvMessages.setCellFactory(new Callback<ListView<Message>, ListCell<Message>>() {
            @Override
            public ListCell<Message> call(ListView<Message> param) {
                return new MessageCell();
            }
        });
        
        String json = getAllWorkers();
        User[] allWorkers = (new Gson()).fromJson(json, User[].class);
        for (User w : allWorkers) workers.getItems().add(w.getUsername());
    }

    @Override
    public void setUser(User user) { 
        this.user = user; 
        
        if (user.getType() == User.VOTER) {
            placeOrder.setVisible(false);
            workers.setVisible(false);
            addWorker.setVisible(false);
            
        } else if (user.getType() == User.CANDIDATE) {
            workers.setVisible(false);
            addWorker.setVisible(false);
        }
    }

    @Override
    public void setParent(HomeController home) { parent = home; }
    
    /*public void setStage(StagePDMS stage) {
        this.stage = stage;
        
        stageName.setText(stage.getName());
        
        updateListView();        
    }
    
    private void updateListView() {
        
        lvMessages.getItems().clear();
        
        Message[] messages = (new Gson()).fromJson(getMessagesOfStage(stage.getID()), Message[].class);
                
        lvMessages.getItems().addAll(messages);
    }
    
    public void sendMessage(ActionEvent ac) {
        
        String text = txtCreateMessage.getText();
        
        String result = createMessage(stage.getID(), user.getId(), text);
        
        if (result.equals("Success")) {
            updateListView();
            
            txtCreateMessage.clear();
        }
    }
    
    public void addWorker(ActionEvent ac) {
        
        String username = (String) workers.getSelectionModel().getSelectedItem();
        
        User worker = (new Gson()).fromJson(getUser(username), User.class);
        
        String result = assignWorker(stage.getID(), worker.getId());
        
        if (result.equals("Success")) {
            
            workers.getSelectionModel().clearSelection();
        }
    }*/
    
    
    public void goHome(ActionEvent ac) {
        parent.changeMainPane("TabPane.fxml");
    }
    
    private static String getService(int serviceID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getService(serviceID);
    }

    private static String getMessagesOfStage(int stageID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getMessagesOfStage(stageID);
    }

    private static String createMessage(int stageID, int userID, java.lang.String text) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.createMessage(stageID, userID, text);
    }

    private static String getAllWorkers() {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getAllWorkers();
    }

    private static String assignWorker(int stageID, int workerID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.assignWorker(stageID, workerID);
    }

    private static String getUser(java.lang.String username) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getUser(username);
    }
}
