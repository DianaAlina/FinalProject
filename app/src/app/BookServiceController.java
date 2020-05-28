package app;

import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import model.User;

/**
 * FXML Controller class
 *
 * @author Diana
 */
public class BookServiceController implements Initializable, HomePaneController {

    private HomeController parent;
    private User user;
    
    public ToggleGroup serviceType = new ToggleGroup();
    public RadioButton rbRepair;
    public RadioButton rbRefurbishment;
    public RadioButton rbDevelopment;
    public DatePicker date;
    public TextField location;
    public Label status;
    public Button btnSubmitBook;
    public Hyperlink back;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rbRepair.setToggleGroup(serviceType);
        rbRefurbishment.setToggleGroup(serviceType);
        rbDevelopment.setToggleGroup(serviceType);
        
        status.setVisible(false);
    }    
    
    public void book(ActionEvent ac) throws DatatypeConfigurationException {
        
        RadioButton selectedRadioButton = (RadioButton) serviceType.getSelectedToggle();
        String value = selectedRadioButton.getText();
        
        int type = 0;
        
        switch(value) {
            case "Repair" : type = 1; break;
            case "Refurbishment" : type = 2; break;
            case "Development" : type = 0; break;
        }
        
        String loc = location.getText();
        
        LocalDate day = date.getValue();
        GregorianCalendar gcal = GregorianCalendar.from(day.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        
        String result = createService(user.getId(), type, loc, xcal);
        
        status.setText(result);
        status.setVisible(true);
        
        if (result.equals("Success")) parent.changeMainPane("TabPane.fxml");
    }
    
    public void goBack(ActionEvent ac) {
                
        parent.changeMainPane("TabPane.fxml");
    }
    
    @Override
    public void setUser(User user) { this.user = user;    }

    @Override
    public void setParent(HomeController home) { parent = home;   }

    private static String createService(int clientID, int type, java.lang.String location, javax.xml.datatype.XMLGregorianCalendar startDate) {
        org.me.pdms.PDMSWebService_Service service = new org.me.pdms.PDMSWebService_Service();
        org.me.pdms.PDMSWebService port = service.getPDMSWebServicePort();
        return port.createService(clientID, type, location, startDate);
    }
}
