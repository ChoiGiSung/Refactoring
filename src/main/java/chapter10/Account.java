package chapter10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private List<Entry> list = new ArrayList<>();

    public double getFlowBetween(DateRange dateRange){
        double result = 0;

        for (Entry entry : list) {
            LocalDate chargeDate = entry.getChargeDate();
            if(dateRange.isCludes(chargeDate)){
                result += entry.getValue();
            }
        }
        return result;
    }

    public void addEntry(Entry entry){
        list.add(entry);
    }
}
