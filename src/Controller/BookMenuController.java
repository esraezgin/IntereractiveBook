/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import ınteractivebook.BookImageObj;
import ınteractivebook.ImageObject;

/**
 * FXML Controller class
 *
 * @author esrae
 */
public class BookMenuController implements Initializable {

    @FXML
    private AnchorPane menuPanelPane;
    @FXML
    private Button penButtton;
    @FXML
    private Button rubberButton;
    @FXML
    private Button exitScribButton;
    @FXML
    private Pane projectTitlePane;
    @FXML
    private Button backPageButton;
    @FXML
    private Button nextPageButton;
    @FXML
    private Pane bookPane;
    @FXML
    private Canvas bookCanvas;
    @FXML
    private Button blue1;
    @FXML
    private Button red1;
    @FXML
    private Button green1;

    @FXML
    private ImageView img2;
    public int count = 0;
    public ArrayList<String> list2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.print("finish initilize");
        BookImageObj resim = new BookImageObj();
        list2 = resim.listBook;
        Image image = new Image(list2.get(count));
        img2.setImage(image);
        System.out.print("finish initilize");
    }

    @FXML
    private void nextPageButtonAction(ActionEvent event) {

        Image image = new Image(list2.get(count));
        img2.setImage(image);
        if (list2.size() - 1 == count) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Listeyi aştınız", ButtonType.OK);
            alert.showAndWait();
        } else {
            count++;
        }
    }

    @FXML
    private void backPageButtonAction(ActionEvent event) {
        Image image = new Image(list2.get(count));
        img2.setImage(image);
        if (0 == count) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Listeyi aştınız", ButtonType.OK);
            alert.showAndWait();
        } else {
            count--;
        }
    }

    @FXML
    private void penButtonAction(ActionEvent event) {

        GraphicsContext graphicsContext = bookCanvas.getGraphicsContext2D();
        bookCanvas.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                graphicsContext.beginPath();
                graphicsContext.moveTo(event.getX(), event.getY());
                graphicsContext.stroke();

            }
        });
        bookCanvas.addEventHandler(MouseEvent.MOUSE_DRAGGED,
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
        if (blue1.isPressed()) {
            blueAct(event);
        } else if (red1.isPressed()) {
            redAct(event);
        } else if (green1.isPressed()) {
            greenAct(event);
        }
    }

    @FXML
    private void rubberbuttonAction(ActionEvent event) {
        GraphicsContext graphicsContext = bookCanvas.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, bookCanvas.getWidth(), bookCanvas.getHeight());
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
    private void blueAct(ActionEvent event) {
        GraphicsContext graphicsContext = bookCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 102, 255));
    }

    @FXML
    private void redAct(ActionEvent event) {
        GraphicsContext graphicsContext = bookCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 0, 0));
    }

    @FXML
    private void greenAct(ActionEvent event) {
        GraphicsContext graphicsContext = bookCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(51, 204, 51));
    }

}
