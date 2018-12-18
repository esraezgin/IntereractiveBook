/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author esrae
 */
public class WordController implements Initializable {

    @FXML
    private AnchorPane dictiPane;
    @FXML
    private Button backTab;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backTabaCTİON(ActionEvent event) throws IOException {
        Stage scribStage = (Stage) backTab.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/BookMenu.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scribStage.setScene(scene);
        scribStage.show();
    
    }
    }
