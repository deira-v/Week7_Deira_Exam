package ie.atu;

public class Product {
    //fields of Product
    private int totalItems;
    private String productID;
    private String name;
    private double price;
    private int quantity;

    //Constructor
    public Product(){
        totalItems = 0;
        productID = "";
        name = "";
        price = 0;
        quantity = 0;
    }

    public String getProductID() {
        return productID;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
