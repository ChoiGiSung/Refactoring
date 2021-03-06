package chapter1;

import chapter1.price.ChildrenPrice;
import chapter1.price.NewReleasePrice;
import chapter1.price.Price;
import chapter1.price.RegularPrice;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;

    public Movie(String title, int price) {
        this.title = title;
        setPriceCode(price);
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int code) {
        switch (code) {
            case Movie.REGULAR:
                price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case Movie.CHILDREN:
                price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("잘못된 가격 코드");
        }
    }

}
