/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author esrae
 */
public class PaletController implements Initializable {

    PaletController paletController;
    MainPageController mainPageController;
    @FXML
    private AnchorPane menuPanelPane;
    
    Stage stage=(Stage)menuPanelPane.getScene().getWindow();

    public  void PaletControllers(PaletController paletController) {
        this.paletController=paletController;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }
public void  MenuCall(Stage stage)
{
    this.stage=stage;
      try {
          FXMLLoader loader =new FXMLLoader(getClass().getResource("/FXML/MenuPalet.fxml"));     
          Parent root = loader.load();
          Scene scene = new Scene(root);
          stage.setScene(scene); 
          stage.show();
        } catch (IOException ex) {
            System.out.println(ex);;
        }
   
}

    void PaletControllers(MainPageController maincontroller) {
        this.mainPageController=maincontroller;
    }
    
 
}
