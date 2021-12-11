package chapter11;

import java.time.LocalDate;

public class PreferredCustomer extends Customer implements BillAble{

    public double chargeFor(LocalDate start,LocalDate end){
        return 1.0;
    }

    @Override
    public int getBill() {
        return 1;
    }
}
