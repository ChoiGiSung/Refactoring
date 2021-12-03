package chapter1.price;

import chapter1.Movie;

public class ChildrenPrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }
}
