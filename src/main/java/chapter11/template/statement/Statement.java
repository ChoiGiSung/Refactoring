package chapter11.template.statement;

import chapter11.template.Customer;
import chapter11.template.Rental;

public abstract class Statement {

    public abstract String value(Customer customer);
    public abstract String headerString(Customer customer);
    public abstract String eachRentalString(Rental rental);
    public abstract String footerString(Customer customer);

}
