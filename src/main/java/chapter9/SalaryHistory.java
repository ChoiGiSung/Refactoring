package chapter9;

public class SalaryHistory {

    private int monthSalary;

    public SalaryHistory(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getMonthSalary(){
        return monthSalary;
    }

    public static SalaryHistory basic(){
        return new SalaryHistory(0);
    }
}
