package chapter9;

public class Employee {

    public SalaryHistory salaryHistory;

    public Employee(int salary) {
        salaryHistory = new SalaryHistory(salary);
    }

    public SalaryHistory getSalaryHistory() {
        return salaryHistory;
    }
}
