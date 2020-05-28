package app;

import com.google.gson.Gson;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Message;
import model.StagePDMS;
import model.User;

/**
 *
 * @author diana
 */
public class MessageCell extends ListCell<Message> {
    
    public Text textMessage;
        
    public MessageCell() {
        loadFXML();
    }
    
    private void loadFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("message_cell.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    protected void updateItem(Message message, boolean empty) {
        
        if (empty) {
            setText(null);
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        
        } else {
            
            User user = (new Gson()).fromJson(getUserByID(message.getUserID()), User.class);
                        
            textMessage.setText(user.getName() + ": " + message.getText());
            
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
    }

    private static String getUserByID(int userID) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.getUserByID(userID);
    }
}

