package chapter6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ItemTest {

    @Test
    void test(){
        Item item = new Item(1,1000);

        double price = item.getPrice();

        Assertions.assertThat(price).isEqualTo(980.0);
    }

    @Test
    void testPrice(){
        Item item = new Item(1,1000);
        double price = item.totalPrice();

        Assertions.assertThat(price).isEqualTo(1100.0);
    }

}
