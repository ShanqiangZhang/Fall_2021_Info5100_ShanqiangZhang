package Ass5_Question3;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> shoppingCart = new ArrayList<>();

    public ShoppingCart() {
    }

    public void addItem(Item item){
        shoppingCart.add(item);

    }
    public void removeItem(Item item){
        shoppingCart.remove(item);
    }
    public int calculateTotal(){
        int all = 0;
        for (Item item : shoppingCart) {
            all += item.getPrice();
        }
        return all;
    }
    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
