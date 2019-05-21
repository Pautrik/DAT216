package imat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import se.chalmers.cse.dat216.project.IMatDataHandler;
import se.chalmers.cse.dat216.project.Product;
import se.chalmers.cse.dat216.project.ShoppingCart;
import se.chalmers.cse.dat216.project.ShoppingItem;

import java.io.IOException;
import java.util.List;


public class ProductItem extends AnchorPane {

    @FXML private Text productName;
    @FXML private ImageView productImage;
    @FXML private ImageView productFavorite;
    @FXML private Text productPrice;
    @FXML private Text productAmount;


    private MainController parentController;
    private IMatDataHandler iMatDataHandler;

    public ProductItem(MainController controller, Product product) {


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product_item.fxml"));

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

        String priceAndUnit = Double.toString(product.getPrice()) + product.getUnit();
        productPrice.textProperty().set(priceAndUnit);

        double amount = 0.0;
        List<ShoppingItem> items = iMatDataHandler.getShoppingCart().getItems();
        for(ShoppingItem item : items) {
            if(item.getProduct() == product) {
                amount = item.getAmount();
                break;
            }
        }
        productAmount.textProperty().set(Double.toString(amount));
    }
}
