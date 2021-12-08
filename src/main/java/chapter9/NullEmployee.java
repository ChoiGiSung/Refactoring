package chapter9;

public class NullEmployee extends Employee{

    public boolean isNull(){
        return true;
    }

    @Override
    public SalaryHistory getSalaryHistory() {
        return SalaryHistory.basic();
    }
}
