package se.lexicon;

import se.lexicon.dao.IVendingMachine;
import se.lexicon.model.Chocolate;
import se.lexicon.model.CocaCola;
import se.lexicon.model.Product;
import se.lexicon.dao.VendingMachineImpl;
import se.lexicon.model.Sandwich;


public class App {
    public static void main(String[] args) {
        Product[] products = {
                new CocaCola(1, "CocaCola", 20, "30 cl.", "Original"),
                new Sandwich(2, 35, "Ham & Cheeze", "ham&cheeze"),
                new Chocolate(3, 20, "Daim", "Daim double", "20 gr.")};


        //Product[] Prod = {products1, products2, product3};

        IVendingMachine vendingMachine = new VendingMachineImpl(products);
        for (String string : vendingMachine.getProducts()) {
            System.out.println(string);
            System.out.println("-----");
        }
        vendingMachine.addCurrency(100);
        Product Daim  = vendingMachine.request(3);
        System.out.println(Daim.use());
        System.out.println(vendingMachine.getBalance());


    }
}
