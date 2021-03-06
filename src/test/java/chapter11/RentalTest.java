package chapter11;

import chapter11.template.Customer;
import chapter11.template.Movie;
import chapter11.template.Rental;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RentalTest {

    @Test
    void sample(){
        Movie regular = new Movie("고질라",0);
        Movie newRelease = new Movie("제임슨본",1);
        Movie children = new Movie("텔레토비",2);

        Customer customer1 = new Customer("손님1");
        Customer customer2 = new Customer("손님2");

        Rental rental1 = new Rental(regular,3);
        Rental rental2 = new Rental(newRelease,4);
        Rental rental3 = new Rental(children,5);

        customer1.addRental(rental1);
        customer1.addRental(rental2);

        customer2.addRental(rental2);
        customer2.addRental(rental3);

        System.out.println(customer1.statement());
        System.out.println(customer2.statement());

        assertThat(customer1.statement()).contains("15.5");
        assertThat(customer2.statement()).contains("16.5");
    }
}
