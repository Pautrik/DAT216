package imat;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class ProductItem extends AnchorPane {

    private MainController parentController;

    public ProductItem(MainController controller) {


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product_item.fxml"));

        // Comment

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        this.parentController = controller;

    }
}
