package chapter11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BillAbleTest {

    @Test
    void test(){
        PreferredCustomer preferredCustomer = new PreferredCustomer();

        int bill = sample(preferredCustomer);

        assertThat(bill).isEqualTo(1);
    }

    private int sample(BillAble able){
        return able.getBill();
    }

}
