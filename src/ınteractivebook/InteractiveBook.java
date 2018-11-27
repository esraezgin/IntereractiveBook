package ınteractivebook;

import Controller.MainPageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InteractiveBook extends Application {

    static MainPageController mainController;

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/mainPage.fxml"));
            Parent root = loader.load();      
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
