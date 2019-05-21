package imat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import se.chalmers.cse.dat216.project.IMatDataHandler;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private IMatDataHandler iMatDataHandler;

    @FXML private Button toShopButton;
    @FXML private Button earlierRecieptsButton;
    @FXML private SplitPane shopPane;
    @FXML private AnchorPane userPane;
    @FXML private StackPane paymentPane;
    @FXML private StackPane historyPane;
    @FXML private AnchorPane startPane;
    @FXML private FlowPane testFlowPane;

    @FXML private ImageView testImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        testFlowPane.getChildren().add(new ProductItem(this));
        iMatDataHandler = IMatDataHandler.getInstance();
    }

    public IMatDataHandler getIMatDataHandler() {
        return iMatDataHandler;
    }

    @FXML
    private void showShopPane() {
        shopPane.toFront();
    }

    @FXML
    private void showUserPane() {
        userPane.toFront();
    }

    @FXML
    private void showPaymentPane() { paymentPane.toFront(); }

    @FXML
    private void showHistoryPane() { historyPane.toFront(); }

    @FXML
    private void showStartPane() { startPane.toFront(); }

    @FXML
    private void test() {
        System.out.println("test");
    }

}
