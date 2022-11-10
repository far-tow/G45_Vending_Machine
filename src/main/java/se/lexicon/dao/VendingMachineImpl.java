package se.lexicon.dao;

import se.lexicon.model.Product;

public class VendingMachineImpl implements IVendingMachine {
    int depositPool = 0;
    private final Product[] products;
    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }


    //Add Currency:
    //Add money to the deposit pool. Only accepts the following values: 1,2,5,10,20,50,100,200,500,1000
    int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    @Override
    public void addCurrency(int amount) {
        /*for (int denomination : denominations) {
            if (denomination == amount) {
                depositPool += amount;
            } //else {
                //System.out.println("Amount is NOT valid!!!, Valid amounts are: " + toString(denominations));
           // }
        }*/

        if(amount == denominations[0] || amount == denominations[1] || amount == denominations[2] ||
                amount == denominations[3] || amount == denominations[4]  || amount == denominations[5]  ||
                amount == denominations[6]  || amount == denominations[7]  || amount == denominations[8]  ||
                amount == denominations[9] ){

            depositPool += amount;
        }else{
            System.out.println("Amount is NOT valid!!!, Valid amounts are: " + denominations);
        }
    }

    //Request:
    //o Buy requested Product if there is enough money in the depositPool.
    @Override
    /*public Product request(int id) {
        for (int i = 0; i < products.length; i++) {

            if (products[i].getId() == id) {
                if (depositPool >= products[i].getPrice()) {
                    depositPool -= products[i].getPrice();
                    return products[i];
                }
            }
        }
        return null;
    }*/
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (product.getPrice() <= depositPool) {
                    depositPool = (int) (depositPool - product.getPrice());
                    return product;
                } else {
                    throw new RuntimeException("Product " + product.getProductName() + " is too expensive");
                }
            }
        }
        throw new RuntimeException("Could not find Product with id " + id);
    }

    //End Session:
    //o Returns depositPool and set it to 0
    @Override
    public int endSession() {
        int change = depositPool;

        depositPool = 0;
        return change;
    }

    //Get Description:
    //o Returns a String of a Product description
    @Override
    public String getDescription(int id) {
        for(int i = 0; i < products.length; i++){
            if(products[i].getId() == id){
                return products[i].examine();
            }
        }
        return null;
    }


    //Get balance:
    //o Returns the depositPool (not clearing it)
    @Override
    public int getBalance() {
        return depositPool;
    }

    //Get Products:
    //o Returns String array where each String contains the Product’s id, name and price
    @Override
    public String[] getProducts() {
        String[] productsAsString = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productsAsString[i] = products[i].examine().concat(" price: " + products[i].getPrice());
        }
        return productsAsString;

    }



/* ToDo: fixme: check the return of toString
@author: Farhad   - @Date: 11/9/2022  -   @Time: 5:58 PM
*/


    private String toString(int[] denominations) {
        return " ";
    }

}
