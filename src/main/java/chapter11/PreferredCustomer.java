package chapter11;

import java.time.LocalDate;

public class PreferredCustomer extends Customer{

    public void createBill(LocalDate date){
        double chargeAmount = chargeFor(lastBillDate, date);
        addBill(date,chargeAmount);
    }

    private double chargeFor(LocalDate start,LocalDate end){
        return 1.0;
    }
}
