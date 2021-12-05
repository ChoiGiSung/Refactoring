package chapter6;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item {

    private int quantity;
    private int itemPrice;

    public double getPrice(){
        double discountFactor;
        if(getBasePrice() > 1000){
            discountFactor = 0.95;
        }else {
            discountFactor = 0.98;
        }
        return discountFactor * getBasePrice();
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }
}
