package Application.input;

import Application.Entities.Product;
import java.util.Scanner;
public class Manager {
    private Scanner sc;

    public Manager(){
        this.sc = new Scanner(System.in);
    }
    public void addProducts(Product product) {


        System.out.println();
        System.out.println("Enter the Number of products to be added in stock:");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.print("Updated data:" + product);
    }
    public void removeProducts(Product product){

        System.out.println();
        System.out.println( "Enter the Number of products to be removed in stock:");
        int quantity = sc.nextInt();
        product.romeveProducts(quantity);
        System.out.print("Updated data:"+ product);




        sc.close();

    }
}
