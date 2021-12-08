package chapter9;

public class Service {

    public int getEmployeeSalary(Store store){

        Employee employee = store.getEmployee();
        SalaryHistory salaryHistory = employee.getSalaryHistory();
        return salaryHistory.getMonthSalary();
    }
}
