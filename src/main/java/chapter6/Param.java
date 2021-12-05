package chapter6;

import java.time.LocalDate;
import java.util.Date;

public class Param {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021,12,5);
        nextDateUpdate(d1);
        System.out.println("main d1" + d1);

        LocalDate d2 = LocalDate.of(2021,12,5);
        replaceDateUpdate(d1);
        System.out.println("main d2" + d2);

    }

    private static void replaceDateUpdate(LocalDate d2) {
        d2 = LocalDate.of(d2.getYear(),d2.getMonth(),d2.getDayOfMonth()  + 1);
        System.out.println("리플레이스" + d2);
    }

    private static void nextDateUpdate(LocalDate d1) {
        d1.plusDays(1);
        System.out.println("업데이트"+d1);
    }
}
