package chapter1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Rental {

    private Movie movie;
    private int daysRented;
}
