package chapter11.tempate.statement;

import chapter11.tempate.Customer;
import chapter11.tempate.Rental;

import java.util.List;

public class TextStatement extends Statement{

    @Override
    public String value(Customer customer) {
        List<Rental> rentals = customer.getRentals();

        String result = customer.getName() + "고객님의 대여 기록\n";
        for (Rental rental : rentals) {

            //이번에 대여하는 비디오 정보와 대여료를 출력
            result += "\t" + rental.getMovie().getTitle() + "\n" + rental.getCharge() + "\n";

            //현재까지 누적된 총 대여료
        }

        //푸터 행 추가
        result += "누적 대여료 " + customer.getTotalCharge() + "\n";
        result += "적립 포인트 " + customer.getTotalFrequentRenterPoints() + "\n";
        return result;
    }
}
