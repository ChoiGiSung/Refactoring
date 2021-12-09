package chapter10;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Entry {

    private LocalDate chargeDate;
    private double value;
}
