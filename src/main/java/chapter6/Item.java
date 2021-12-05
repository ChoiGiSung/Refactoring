package chapter6;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item {

    private int quantity;
    private int itemPrice;

    public double getPrice(){
        return  getDiscountFactor() * getBasePrice();
    }

    private double getDiscountFactor() {
        double discountFactor;
        if(getBasePrice() > 1000){
            discountFactor = 0.95;
        }else {
            discountFactor = 0.98;
        }
        return discountFactor;
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }

    public double totalPrice(){
        return getBasePrice() - getQuantityDiscount() + shipping();
    }

    private double shipping() {
        return Math.min(quantity * itemPrice * 0.1,100.0);
    }

    private double getQuantityDiscount() {
        return Math.max(0,quantity - 500) * itemPrice * 0.05;
    }
}
