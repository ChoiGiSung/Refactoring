package chapter1.price;

import chapter1.Movie;

public class RegularPrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
