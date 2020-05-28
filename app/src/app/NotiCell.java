package app;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import model.Notification;

/**
 *
 * @author diana
 */
public class NotiCell extends ListCell<Notification> {
    
    public Label text;
        
    public NotiCell() {
        loadFXML();
    }
    
    private void loadFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("noti_cell.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    protected void updateItem(Notification noti, boolean empty) {
        super.updateItem(noti, empty);
        
        if (empty) {
            setText(null);
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        
        } else {
            
            text.setText(noti.getMessage());
            
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
    }
}
