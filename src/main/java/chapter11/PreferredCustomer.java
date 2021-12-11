package chapter11;

import java.time.LocalDate;

public class PreferredCustomer extends Customer{

    public double chargeFor(LocalDate start,LocalDate end){
        return 1.0;
    }
}
