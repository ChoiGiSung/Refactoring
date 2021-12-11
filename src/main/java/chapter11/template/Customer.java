package chapter11.template;

import chapter11.template.statement.HtmlStatement;
import chapter11.template.statement.TextStatement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement(){
        return new HtmlStatement().value(this);
    }

    public double getTotalCharge(){
        double result = 0;
        for (Rental rental : rentals) {
            result += rental.getCharge();
        }
        return result;
    }

    public int getTotalFrequentRenterPoints(){
        int result = 0;
        for (Rental rental : rentals) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

}
