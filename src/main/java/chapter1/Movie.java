package chapter1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    public double getCharge(int daysRented) {
        double result = 0;

        //비디오 종류별 대여료 계산
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        //기본은 1 포인트
        //최신물을 이틀 이상 대여하면 보너스 포인트 지급
        if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
