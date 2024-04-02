package Application.input;

import Application.Entities.Product;
import java.util.Scanner;

public class DataInput {
    private Scanner sc;
    public DataInput() {
        this.sc = new Scanner(System.in);

    }
    public Product getProductDetails() {

        Product product = new Product();
        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.print("Product data:"+ product);

        return product;
    }
}

