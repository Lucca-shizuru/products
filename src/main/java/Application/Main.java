package Application;

import Application.Entities.Product;
import Application.input.DataInput;
import Application.input.Manager;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        DataInput dataInput = new DataInput();
        Manager manager = new Manager();

        Product product = dataInput.getProductDetails();
        manager.addProducts(product);
        manager.removeProducts(product);



    }
}