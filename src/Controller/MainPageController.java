/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author esrae
 */
public class MainPageController implements Initializable {

    Stage mainStage;
    MainPageController maincontroller;    
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
         Stage scribStage=(Stage)menuPane.getScene().getWindow();
        
        try {
          FXMLLoader loader =new FXMLLoader(getClass().getResource("/FXML/PaintBookMenu.fxml"));     
          Parent root = loader.load();
          Scene scene = new Scene(root);
          scribStage.setScene(scene); 
          scribStage.show();   
        } catch (IOException ex) {
            System.out.println(ex);;
        }
    }
   
    @FXML
    private void bookButtonAction(ActionEvent event) {
       
    }

    @FXML
    private void exitButtonAction(ActionEvent event) throws IOException {
        mainStage = (Stage) exitButton.getScene().getWindow();
          mainStage.close();
    }  
}
