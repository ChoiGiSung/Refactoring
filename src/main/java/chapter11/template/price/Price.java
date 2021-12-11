package chapter11.template.price;

public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented){
        //기본은 1 포인트
        return 1;
    };
}
