package chapter10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getFlowBetween() {

        Account account = new Account();
        Entry entry1 = new Entry(LocalDate.of(2020,1,1),1);
        Entry entry2 = new Entry(LocalDate.of(2021,1,1),1);
        Entry entry3 = new Entry(LocalDate.of(2022,1,1),1);
        Entry entry4 = new Entry(LocalDate.of(2023,1,1),1);

        account.addEntry(entry1);
        account.addEntry(entry2);
        account.addEntry(entry3);
        account.addEntry(entry4);

        double flowBetween = account.getFlowBetween(LocalDate.now(), LocalDate.now().plusYears(1L));
        assertThat(flowBetween).isEqualTo(4.0);
    }
}