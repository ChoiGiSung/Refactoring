package chapter6;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item {

    private int quantity;
    private int itemPrice;

    public double getPrice(){
        int basePrice = quantity * itemPrice;
        double discountFactor;
        if(basePrice > 1000){
            discountFactor = 0.95;
        }else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
