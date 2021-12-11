package chapter11.tempate.statement;

import chapter11.tempate.Customer;
import chapter11.tempate.Rental;

public abstract class Statement {

    public abstract String value(Customer customer);
    public abstract String headerString(Customer customer);
    public abstract String eachRentalString(Rental rental);
    public abstract String footerString(Customer customer);

}
