package se.lexicon.model;

public abstract class Product {

    int id;
    double price;
    String productName;
    public abstract String use();
    public abstract String examine();

    //fields

    public Product() {

    }

    public Product(int id, double price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }


    //methods





//Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    @Override
    public String toString() {
        return "Product{" + "productId=" + id +
                ", product Name='" + productName + '\'' +
                ", price=" + price +
                ", use='" + use() + '\'' +
                '}';
    }
}