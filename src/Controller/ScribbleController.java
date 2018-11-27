
package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ScribbleController implements Initializable {


    @FXML
    private AnchorPane scribAnchorPane;
    @FXML
    private Canvas scribCanvas;
    @FXML
    private Button exitScribButton;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }
    @FXML
    private void exitScribButtonAction(ActionEvent event) throws IOException {

        Stage scribStage = (Stage) exitScribButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/mainPage.fxml"));
            Parent root = loader.load();      
            Scene scene = new Scene(root);
            scribStage.setScene(scene);
            scribStage.show();
    }

}
