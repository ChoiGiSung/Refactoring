package chapter11.template.statement;

import chapter11.template.Customer;
import chapter11.template.Rental;

import java.util.List;

public class HtmlStatement  extends Statement{
    @Override
    public String value(Customer customer) {
        List<Rental> rentals = customer.getRentals();
        String result = headerString(customer);
        for (Rental rental : rentals) {

            //이번에 대여하는 비디오 정보와 대여료를 출력
            result += eachRentalString(rental);

            //현재까지 누적된 총 대여료
        }

        //푸터 행 추가
        result += footerString(customer);
        return result;
    }

    @Override
    public String headerString(Customer customer) {
        return "<H1><EN>"+customer.getName() + "고객님의 대여 기록" +"</EM></H1><P>\n";
    }

    @Override
    public String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + "\n" + rental.getCharge() + "<BR>\n";
    }

    @Override
    public String footerString(Customer customer) {
        String result = "<P>누적 대여료 :<EM>" + customer.getTotalCharge() + "</EM><P>\n";
        result+= "적립 포인트 :<EM>" + customer.getTotalFrequentRenterPoints() + "</EM><P>\n";
        return result;
    }
}
