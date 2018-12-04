package Controller;
import  ınteractivebook.ImageObject;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ScribbleController implements Initializable {

    @FXML
    private AnchorPane scribAnchorPane;
    @FXML
    private AnchorPane menuPanelPane;
    @FXML
    private Button penButtton;
    @FXML
    private Button rubberButton;
    @FXML
    private Button whiteButton;
    @FXML
    private Button pink1Button;
    @FXML
    private Button pink2Button;
    @FXML
    private Button pink3Button;
    @FXML
    private Button pink4Button;
    @FXML
    private Button pink5Button;
    @FXML
    private Button red1Button;
    @FXML
    private Button red2Button;
    @FXML
    private Button red3Button;
    @FXML
    private Button red4Button;
    @FXML
    private Button orange1Button;
    @FXML
    private Button orange2Button;
    @FXML
    private Button orange3Button;
    @FXML
    private Button yellow1Button;
    @FXML
    private Button yellow2Button;
    @FXML
    private Button yellow3Button;
    @FXML
    private Button green1;
    @FXML
    private Button green2;
    @FXML
    private Button green3;
    @FXML
    private Button green4;
    @FXML
    private Button green5;
    @FXML
    private Button green6;
    @FXML
    private Button green7;
    @FXML
    private Button blue1;
    @FXML
    private Button blue2;
    @FXML
    private Button blue3;
    @FXML
    private Button blue4;
    @FXML
    private Button blue5;
    @FXML
    private Button blue6;
    @FXML
    private Button blue7;
    @FXML
    private Button blue8;
    @FXML
    private Button blue9;
    @FXML
    private Button purple1;
    @FXML
    private Button purple2;
    @FXML
    private Button purple3;
    @FXML
    private Button purple4;
    @FXML
    private Button purple5;
    @FXML
    private Button purple6;
    @FXML
    private Button purple7;
    @FXML
    private Button purple8;
    @FXML
    private Button purple9;
    @FXML
    private Button darkgreen1;
    @FXML
    private Button darkgreen2;
    @FXML
    private Button darkgreen3;
    @FXML
    private Button darkgreen4;
    @FXML
    private Button kahv1;
    @FXML
    private Button kahv2;
    @FXML
    private Button kahv3;
    @FXML
    private Button kahv4;
    @FXML
    private Button kahv5;
    @FXML
    private Button kahv6;
    @FXML
    private Button kahv7;
    @FXML
    private Button kahv8;
    @FXML
    private Button kahv9;
    @FXML
    private Button brown1;
    @FXML
    private Button brown2;
    @FXML
    private Button brown3;
    @FXML
    private Button brown5;
    @FXML
    private Button brown8;
    @FXML
    private Button brown10;
    @FXML
    private Button exitScribButton;
    @FXML
    private Pane projectTitlePane;
    @FXML
    private Pane pdfPane;
    @FXML
    private Canvas menuCanvas;
    @FXML
    private Button twoSize;
    @FXML
    private Button sixSize;
    @FXML
    private Button tenSize;
    @FXML
    private Button fourtteenSize;
    @FXML
    private Button eightteenSize;
    @FXML
    private Button twelvetwoSize;
    @FXML
    private Button lineButton;
    @FXML
    private Button circleButton;
    @FXML
    private Button ellipseButton;
    @FXML
    private Button rectButton;
    private ImageView imageView;
     javafx.scene.shape.Rectangle rect;
     javafx.scene.shape.Circle circle;
    SimpleDoubleProperty rectinitX = new SimpleDoubleProperty();
    SimpleDoubleProperty rectinitY = new SimpleDoubleProperty();
    SimpleDoubleProperty rectX = new SimpleDoubleProperty();
    SimpleDoubleProperty rectY = new SimpleDoubleProperty();
    @FXML
    private Button nextButtonImage;
    @FXML
    private Button bakcButtonImage;
    public int count = 0;
    @FXML
    private ImageView img;
    
    public ArrayList<String> list;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ImageObject ima=new ImageObject();
        list =ima.list;
        Image image = new Image(list.get(count));
        img.setImage(image);

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
    private void rubberbuttonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, menuCanvas.getWidth(), menuCanvas.getHeight());

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

        if (pink3Button.isPressed()) {
            pink3ButtonAction(event);
        } else if (whiteButton.isPressed()) {
            whiteButtonAction(event);
        } else if (pink1Button.isPressed()) {
            pink1ButtonAction(event);
        } else if (pink2Button.isPressed()) {
            pink2ButtonAction(event);
        } else if (pink3Button.isPressed()) {
            pink3ButtonAction(event);
        } else if (pink4Button.isPressed()) {
            pink4ButtonAction(event);
        } else if (pink5Button.isPressed()) {
            pink5ButtonAction(event);
        } else if (red1Button.isPressed()) {
            red1ButtonAction(event);
        } else if (red2Button.isPressed()) {
            red2ButtonAction(event);
        } else if (red3Button.isPressed()) {
            red3ButtonAction(event);
        } else if (red4Button.isPressed()) {
            red4ButtonAction(event);
        } else if (orange1Button.isPressed()) {
            orange1ButtonAction(event);
        } else if (orange2Button.isPressed()) {
            orange2ButtonAction(event);
        } else if (orange3Button.isPressed()) {
            orange3ButtonAction(event);
        } else if (yellow1Button.isPressed()) {
            yellow1ButtonAction(event);
        } else if (yellow2Button.isPressed()) {
            yellow2ButtonAction(event);
        } else if (yellow3Button.isPressed()) {
            yellow3ButtonAction(event);
        } else if (green1.isPressed()) {
            green1Action(event);
        } else if (green2.isPressed()) {
            green2Action(event);
        } else if (green3.isPressed()) {
            green3Action(event);
        } else if (green4.isPressed()) {
            green4Action(event);
        } else if (green5.isPressed()) {
            green5Action(event);
        } else if (green6.isPressed()) {
            green6Action(event);
        } else if (green7.isPressed()) {
            green7Action(event);
        } else if (blue1.isPressed()) {
            blue1Action(event);
        } else if (blue2.isPressed()) {
            blue2Action(event);
        } else if (blue3.isPressed()) {
            blue3Action(event);
        } else if (blue4.isPressed()) {
            blue4Action(event);
        } else if (blue5.isPressed()) {
            blue5Action(event);
        } else if (blue6.isPressed()) {
            blue6Action(event);
        } else if (blue7.isPressed()) {
            blue7Action(event);
        } else if (blue8.isPressed()) {
            blue8Action(event);
        } else if (blue9.isPressed()) {
            blue9Action(event);
        } else if (purple1.isPressed()) {
            purple1Action(event);
        } else if (purple2.isPressed()) {
            purple2Action(event);
        } else if (purple3.isPressed()) {
            purple3Action(event);
        } else if (purple4.isPressed()) {
            purple4Action(event);
        } else if (purple5.isPressed()) {
            purple5Action(event);
        } else if (purple6.isPressed()) {
            purple6Action(event);
        } else if (purple7.isPressed()) {
            purple7Action(event);
        } else if (purple8.isPressed()) {
            purple8Action(event);
        } else if (purple9.isPressed()) {
            purple9Action(event);
        } else if (darkgreen1.isPressed()) {
            darkgreen1Action(event);
        } else if (darkgreen2.isPressed()) {
            darkgreen2Action(event);
        } else if (darkgreen3.isPressed()) {
            darkGreen3Action(event);
        } else if (darkgreen4.isPressed()) {
            darkgreen4Action(event);
        } else if (kahv1.isPressed()) {
            kahv1Action(event);
        } else if (kahv2.isPressed()) {
            kahv2Action(event);
        } else if (kahv3.isPressed()) {
            kahv3Action(event);
        } else if (kahv4.isPressed()) {
            darkgreen4Action(event);
        } else if (kahv5.isPressed()) {
            kahv5Action(event);
        } else if (kahv5.isPressed()) {
            kahv6Action(event);
        } else if (kahv6.isPressed()) {
            kahv6Action(event);
        } else if (kahv7.isPressed()) {
            kahv7Action(event);
        } else if (kahv8.isPressed()) {
            kahv8Action(event);
        } else if (kahv9.isPressed()) {
            darkgreen4Action(event);
        } else if (brown1.isPressed()) {
            brown1Action(event);
        } else if (brown2.isPressed()) {
            brown2Action(event);
        } else if (brown3.isPressed()) {
            brown3Action(event);
        } else if (brown5.isPressed()) {
            brown5Action(event);
        } else if (brown8.isPressed()) {
            brown8Action(event);
        } else if (brown10.isPressed()) {
            brown10Action(event);
        } else {

            graphicsContext.setStroke(Color.BLACK);
        }

    }

    @FXML
    private void pink3ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(230, 0, 153));

    }

    @FXML
    private void whiteButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.WHITE);
    }

    @FXML
    private void pink1ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 204, 238));
    }

    @FXML
    private void pink2ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 102, 204));

    }

    @FXML
    private void pink4ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 0, 102));
    }

    @FXML
    private void pink5ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 102, 102));
    }

    @FXML
    private void red1ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 26, 26));
    }

    @FXML
    private void red2ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(230, 0, 0));
    }

    @FXML
    private void red3ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(179, 0, 0));
    }

    @FXML
    private void red4ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 77, 77));
    }

    @FXML
    private void orange1ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(205, 204, 153));
    }

    @FXML
    private void orange2ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 153, 51));
    }

    @FXML
    private void orange3ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 128, 0));
    }

    @FXML
    private void yellow1ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 255, 104));
    }

    @FXML
    private void yellow2ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 255, 77));
    }

    @FXML
    private void green1Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(223, 255, 128));
    }

    @FXML
    private void green2Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(172, 230, 0));
    }

    @FXML
    private void green3Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(96, 128, 0));
    }

    @FXML
    private void green4Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(153, 255, 204));
    }

    @FXML
    private void green5Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(102, 255, 179));
    }

    @FXML
    private void green6Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 255, 128));
    }

    @FXML
    private void green7Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(26, 255, 140));
    }

    @FXML
    private void blue1Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(179, 255, 255));
    }

    @FXML
    private void blue2Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(77, 255, 255));
    }

    @FXML
    private void blue3Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 179, 179));
    }

    @FXML
    private void blue4Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 102, 102));
    }

    @FXML
    private void blue5Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 153, 255));
    }

    @FXML
    private void blue6Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 102, 204));
    }

    @FXML
    private void blue7Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 164, 128));
    }

    @FXML
    private void blue8Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 51, 153));
    }

    @FXML
    private void blue9Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 77, 230));
    }

    @FXML
    private void purple1Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(230, 176, 255));
    }

    @FXML
    private void purple2Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(217, 179, 255));
    }

    @FXML
    private void purple3Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(221, 153, 255));
    }

    @FXML
    private void purple4Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(204, 153, 255));
    }

    @FXML
    private void purple5Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(179, 102, 255));
    }

    @FXML
    private void purple6Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(153, 51, 255));
    }

    @FXML
    private void purple7Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(155, 0, 230));
    }

    @FXML
    private void purple8Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(77, 0, 153));
    }

    @FXML
    private void purple9Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(51, 0, 102));
    }

    @FXML
    private void darkgreen1Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 153, 153));
    }

    @FXML
    private void darkgreen2Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 128, 64));
    }

    @FXML
    private void darkGreen3Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(0, 77, 0));
    }

    @FXML
    private void darkgreen4Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(179, 179, 0));
    }

    @FXML
    private void kahv1Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(204, 102, 0));
    }

    @FXML
    private void kahv2Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(210, 12, 121));
    }

    @FXML
    private void kahv3Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(153, 51, 51));
    }

    @FXML
    private void kahv4Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(115, 38, 38));
    }

    @FXML
    private void kahv5Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(204, 41, 0));
    }

    @FXML
    private void kahv6Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(153, 31, 0));
    }

    @FXML
    private void kahv7Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(77, 15, 0));
    }

    @FXML
    private void kahv8Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(217, 179, 140));
    }

    @FXML
    private void kahv9Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(72, 115, 17));
    }

    @FXML
    private void brown1Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(153, 77, 0));
    }

    @FXML
    private void brown2Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(102, 51, 0));
    }

    @FXML
    private void brown3Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(214, 214, 194));
    }

    @FXML
    private void brown5Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(163, 163, 117));
    }

    @FXML
    private void brown8Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(77, 77, 51));
    }

    @FXML
    private void brown10Action(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.BLACK);
    }

    @FXML
    private void yellow3ButtonAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.rgb(255, 255, 0));

    }

    @FXML
    private void twoSizeAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setLineWidth(2);
    }

    @FXML
    private void sixSizeAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setLineWidth(6);
    }

    @FXML
    private void tenSizeAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setLineWidth(10);
    }

    @FXML
    private void fourtteenSizeAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setLineWidth(14);
    }

    @FXML
    private void eightteenSizeAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setLineWidth(18);
    }

    @FXML
    private void twelvetwoSizeAction(ActionEvent event) {
        GraphicsContext graphicsContext = menuCanvas.getGraphicsContext2D();
        graphicsContext.setLineWidth(22);
    }

    @FXML
    private void lineButtonAction(ActionEvent event) {
    }

    @FXML
    private void circleButtonAction(ActionEvent event) {
        Stage stage=(Stage)pdfPane.getScene().getWindow();
        pdfPane=new Pane();
        Scene scene = new Scene(pdfPane, 800, 600);
          stage.setScene(scene);
        scene.setOnMouseDragged(mouseHandler);
        scene.setOnMousePressed(mouseHandler);
        scene.setOnMouseReleased(mouseHandler);

    }

    @FXML
    private void ellipseButtonAction(ActionEvent event) {
      
    }

   

    @FXML
    private void nextButtonImageAction(ActionEvent event) {
       
        Image image = new Image(list.get(count));
        img.setImage(image);
        if (list.size() - 1 == count) {
            Alert alert = new Alert(AlertType.ERROR, "Listeyi aştınız", ButtonType.OK);
            alert.showAndWait();
        } else {
            count++;
        }

    }

    @FXML
    private void bakcButtonImageAction(ActionEvent event) {

        Image image = new Image(list.get(count));
        img.setImage(image);

        if (0 == count) {
            Alert alert = new Alert(AlertType.ERROR, "Listeyi aştınız", ButtonType.OK);
            alert.showAndWait();}
             else {
                count--;
            }
        }
     @FXML
    private void rectButtonAction(ActionEvent event) {
        Stage stage=(Stage)pdfPane.getScene().getWindow();
        pdfPane=new Pane();
       // Scene scene = new Scene(pdfPane, 800, 600);
      //  stage.setScene(scene);
        pdfPane.setOnMouseDragged(mouseHandler);
        pdfPane.setOnMousePressed(mouseHandler);
        pdfPane.setOnMouseReleased(mouseHandler);
        rect = getNewRectangle();
        rect.widthProperty().bind(rectX.subtract(rectinitX));
        rect.heightProperty().bind(rectY.subtract(rectinitY));
        pdfPane.getChildren().add(rect);
        }
    
    private javafx.scene.shape.Rectangle getNewRectangle() {
        javafx.scene.shape.Rectangle r = new javafx.scene.shape.Rectangle();
        r.setFill(Color.web("black", 0.1));
        r.setStroke(Color.BLACK);
        return r;
    }
    
        EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent mouseEvent) {

            if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) {
                rect.setX(mouseEvent.getX());
                rect.setY(mouseEvent.getY());
                rectinitX.set(mouseEvent.getX());
                rectinitY.set(mouseEvent.getY());
            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_DRAGGED) {
                rectX.set(mouseEvent.getX());
                rectY.set(mouseEvent.getY());
            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_RELEASED) {
                // Clone the rectangle
                javafx.scene.shape.Rectangle r = getNewRectangle();
                r.setX(rect.getX());
                r.setY(rect.getY());
                r.setWidth(rect.getWidth());
                r.setHeight(rect.getHeight());
                pdfPane.getChildren().add(r);
                // Hide the rectangle
                rectX.set(0);
                rectY.set(0);
            }
        }
    };

    private Circle getNewCircle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


