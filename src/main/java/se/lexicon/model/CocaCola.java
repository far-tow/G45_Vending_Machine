package se.lexicon.model;

public class CocaCola extends Product {
    private String volume;
    private String kind;


    public CocaCola (){

    }
    public CocaCola(int id, String productName, double price, String volume, String kind) {
        super (id,price,productName);
        this.volume = volume;
        this.kind = kind;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String examine() {
        return "The " + getProductName() + " is a great drink . It is a " + getKind() +
                " type and the price for a " + getVolume() + " is only " + getPrice() + " USD.";
    }

    @Override
    public String use() {
        return "This " + getProductName() + " is a " + getKind();
    }

    @Override
    public String toString() {
        return "Product{" + "product id=" + id + ", Name='" + productName + '\'' + ", price=" + price + ", kind='" + kind + '\'' + '}';
    }
}
