package chapter10;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class DateRange {

    private final LocalDate start;
    private final LocalDate end;

    public boolean isCludes(LocalDate chargeDate) {
        return chargeDate.isEqual(start) || chargeDate.isEqual(end)||
                (chargeDate.isAfter(start) || chargeDate.isBefore(end));
    }
}
