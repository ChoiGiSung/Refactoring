package chapter10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private List<Entry> list = new ArrayList<>();

    public double getFlowBetween(LocalDate start, LocalDate end){
        double result = 0;

        for (Entry entry : list) {
            LocalDate chargeDate = entry.getChargeDate();
            if(chargeDate.isEqual(start) || chargeDate.isEqual(end)||
                    (chargeDate.isAfter(start) || chargeDate.isBefore(end))){
                result += entry.getValue();
            }
        }
        return result;
    }

    public void addEntry(Entry entry){
        list.add(entry);
    }
}
