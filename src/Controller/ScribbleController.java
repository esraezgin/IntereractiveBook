package Controller;

import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.Stage;

public class ScribbleController implements Initializable {

    @FXML
    private AnchorPane scribAnchorPane;
    @FXML
    private Button exitScribButton;
    @FXML
    private AnchorPane menuPanelPane;
    @FXML
    private Button penButtton;
    @FXML
    private Button rubberButton;
    @FXML
    private Button shapesButton;
    @FXML
    private Pane projectTitlePane;
    @FXML
    private Pane pdfPane;
    @FXML
    private Canvas menuCanvas;
    @FXML
    private Button pink3Button;

   

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
    @FXML
    private void penButtonAction(ActionEvent event) {

         GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        menuCanvas.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                graphicsContext.beginPath();
                graphicsContext.moveTo(event.getX(), event.getY());
                graphicsContext.stroke();

            }
        });
        menuCanvas.addEventHandler(MouseEvent.MOUSE_DRAGGED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                graphicsContext.lineTo(event.getX(), event.getY());
                graphicsContext.stroke();
                graphicsContext.closePath();
                graphicsContext.beginPath();
                graphicsContext.moveTo(event.getX(), event.getY());
            }
        });
    }

    @FXML
    private void rubberbuttonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D(); 
      
     
    }
    
    @FXML
    private void shapesButtonAction(ActionEvent event) {

    }

    @FXML
    private void pink3ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.BLUE);
           
    }

}
