package chapter11;

import java.time.LocalDate;

public class RegularCustomer extends Customer{

    public void createBill(LocalDate date){
        double chargeAmount = chargeFor(lastBillDate, date);
        addBill(date,chargeAmount);
    }

    public double chargeFor(LocalDate start,LocalDate end){
        return 0.0;
    }
}
