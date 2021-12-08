package chapter9;

public class Employee {

    public SalaryHistory salaryHistory;

    protected Employee(){}

    public Employee(int salary) {
        salaryHistory = new SalaryHistory(salary);
    }

    public static Employee newNull(){
        return new NullEmployee();
    }

    public SalaryHistory getSalaryHistory() {
        return salaryHistory;
    }

    public boolean isNull(){
        return false;
    }
}
