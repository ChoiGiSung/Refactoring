package chapter1;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Enumeration;
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

        String result = this.name + "고객님의 대여 기록\n";
        for (Rental rental : rentals) {

            //이번에 대여하는 비디오 정보와 대여료를 출력
            result += "\t" + rental.getMovie().getTitle() + "\n" + rental.getCharge() + "\n";

            //현재까지 누적된 총 대여료
        }

        //푸터 행 추가
        result += "누적 대여료 " + getTotalCharge() + "\n";
        result += "적립 포인트 " + getTotalFrequentRenterPoints() + "\n";
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        for (Rental rental : rentals) {
            result += rental.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        for (Rental rental : rentals) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

}
