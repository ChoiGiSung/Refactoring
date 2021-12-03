package chapter1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Rental {

    private Movie movie;
    private int daysRented;

    public double getCharge() {
        double result = 0;

        //비디오 종류별 대여료 계산
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2) {
                    result += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if (getDaysRented() > 3) {
                    result += (getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }
}
