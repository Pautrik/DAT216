package imat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        ResourceBundle bundle = java.util.ResourceBundle.getBundle("imat/resources/IMat");

        Parent root = FXMLLoader.load(getClass().getResource("imat.fxml"));
        Scene scene = new Scene(root, 1280, 720);

        stage.getIcons().add(new Image("imat/icon.png"));
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
