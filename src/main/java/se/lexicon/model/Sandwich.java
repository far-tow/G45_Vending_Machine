package se.lexicon.model;

public class Sandwich extends Product {
    private String type;

    //Constructors
    public Sandwich () {

    }
    public Sandwich (int id, double price, String productName, String type) {
        super(id, price, productName);
        this.type = type;

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
        return "This " + getProductName() + " " + " and is a " + getType() + " and cost " + getPrice() + " USD.";
    }

    @Override
    public String use() {
        return "This " + getProductName() + " is a " + getType() + " sandwich!";
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" + "product id=" + id + ", Name='" + productName + '\'' + ", price=" + price + ", type='" + type + '\'' + '}';
    }


}
