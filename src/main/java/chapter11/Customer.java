package chapter11;

import java.time.LocalDate;

public abstract class Customer {

    protected LocalDate lastBillDate;

    public void addBill(LocalDate localDate,double amount){

    }

    public void createBill(LocalDate date){
        double chargeAmount = chargeFor(lastBillDate, date);
        addBill(date,chargeAmount);
    }

    public abstract double chargeFor(LocalDate start,LocalDate end);

}
