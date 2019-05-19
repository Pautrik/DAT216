package imat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import se.chalmers.cse.dat216.project.IMatDataHandler;
import se.chalmers.cse.dat216.project.Product;

import java.io.IOException;


public class ProductItem extends AnchorPane {

    @FXML private Text productName;
    @FXML private ImageView productImage;
    @FXML private ImageView productFavorite;

    private MainController parentController;
    private IMatDataHandler iMatDataHandler;

    public ProductItem(MainController controller, Product product) {


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product_item.fxml"));

        // Comment

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        this.parentController = controller;
        iMatDataHandler = this.parentController.getIMatDataHandler();

        productName.textProperty().set(product.getName());

        this.productImage.imageProperty().setValue(iMatDataHandler.getFXImage(product));

        boolean isFavorite = parentController.getIMatDataHandler().isFavorite(product);
        String starImagePath = isFavorite ? "resources/favorite.png" : "resources/notfavorite.png";
        productFavorite.imageProperty().set(new Image(starImagePath));
    }
}
