package ie.atu;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {
        int count = 0, i = 1;

        Scanner sc = new Scanner(System.in);

        //new array list to store products
        List<Product> productList = new ArrayList<>();

        Product product1 = new Product();

        System.out.println("Please Enter the number of Products you want to add:");
        int totalItems = sc.nextInt();

        while(count < totalItems){

            System.out.println("Item # " + 1);
            System.out.println("Please Enter the Product's name:");
            String name = sc.next();
            product1.setName(name);

            System.out.println("Please enter the Product's ID");
            String productID = sc.next();
            //check for the same product ID
            for(Product products : productList){
                while(products.getProductID().equalsIgnoreCase(productID)){
                    System.out.println("Product already Exists. Please Enter a different ID.");
                    productID = sc.next();

                }
            }
            product1.setProductID(productID);

            System.out.println("Please Enter the Product's Price:");
            double price = sc.nextDouble();
            product1.setPrice(price);

            System.out.println("Please Enter Product's Quantity:");
            int quantity = sc.nextInt();
            product1.setQuantity(quantity);

            productList.add(product1);

            count++;
            i++;

        }

        for (Product p :  productList){
            System.out.println(p);
        }

        System.out.println("Update product:");

        System.out.println("Enter Product ID:");
        String productID = sc.next();

        for (Product checkProd : productList) {
            if (checkProd.getProductID().equalsIgnoreCase(productID)) {
                System.out.println("Change product Name:");
                String name = sc.next();
                System.out.println("Change product Price:");
                double price = sc.nextDouble();
                System.out.println("Change Quantity:");
                int quantity = sc.nextInt();

                product1.setName(name);
                product1.setPrice(price);
                product1.setQuantity(quantity);

            }

            else{
                System.out.println("Product Not Found");
            }

        }

        //print all the products from the list
        for (Product p :  productList){
            System.out.println(p);
        }



    }
}
