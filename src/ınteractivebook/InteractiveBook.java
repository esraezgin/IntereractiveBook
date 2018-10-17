
package ınteractivebook;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InteractiveBook extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
         try {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/mainPage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        stage.show();
        } catch (Exception ex) {
           System.out.print(ex);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
