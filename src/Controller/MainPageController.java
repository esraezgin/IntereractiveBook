/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author esrae
 */
public class MainPageController implements Initializable {

    Stage mainStage,otherStage;
    @FXML
    private Pane mainPane;
    @FXML
    private Pane menuPane;
    @FXML
    private Button paintingBook;
    @FXML
    private Button scribbleButton;
    @FXML
    private Button bookButton;
    @FXML
    private Button exitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
    }

    @FXML
    private void paintingBookAction(ActionEvent event) {
    }

    @FXML
    private void scribbleButtonAction(ActionEvent event) {
    }

    @FXML
    private void bookButtonAction(ActionEvent event) {
    }

    @FXML
    private void exitButtonAction(ActionEvent event) {
        mainStage = (Stage) exitButton.getScene().getWindow();
        mainStage.close();
    }

}
