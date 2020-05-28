package app;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author diana
 */
public class App extends Application{
    
    public Stage logstage; 
    
    @Override
    public void start(Stage stage) throws Exception {
        
        try{
            
            Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            logstage = stage;
            stage.show();
        }
        catch(Exception e) { e.printStackTrace(); }
    }
     
    public static void main(String[] args) {
        launch(args);
    }
       
}