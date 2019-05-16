package imat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML private Button toShopButton;
    @FXML private Button earlierRecieptsButton;
    @FXML private AnchorPane shopPane;
    @FXML private FlowPane testFlowPane;

    @FXML private ImageView testImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        testFlowPane.getChildren().add(new ProductItem(this));
    }

    @FXML
    private void toShopAction() {
        shopPane.toFront();
    }

    @FXML
    private void test() {
        System.out.println("test");
    }

}
