package se.lexicon.model;

import java.util.Objects;


public class Chocolate extends Product {

    private String type;
    private String weight;

    //Constructors
    public Chocolate() {

    }

    public Chocolate(int id, double price, String productName, String type, String weight) {
        super(id, price, productName);
        this.type = type;
        this.weight = weight;

    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public void setProductName(String productName) {
        super.setProductName(productName);
    }

    @Override
    public String examine() {
        return "This " + getProductName() + " " + " weighs " + getWeight() + " and is a " + getType() + " and cost " + getPrice() + " USD.";
    }

    @Override
    public String use() {
        return "This " + getProductName() + " is a " + getType() + " Chocolate!";
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" + "product id=" + id + ", Name='" + productName + '\'' + ", price=" + price + ", text='" + type + '\'' + '}';
    }


}
