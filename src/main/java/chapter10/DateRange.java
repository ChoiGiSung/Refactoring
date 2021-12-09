package chapter10;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class DateRange {

    private final LocalDate start;
    private final LocalDate end;

}
