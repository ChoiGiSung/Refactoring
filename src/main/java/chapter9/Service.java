package chapter9;

public class Service {

    public int getEmployeeSalary(Store store){

        Employee employee = store.getEmployee();
        SalaryHistory salaryHistory;
        if(employee == null){
            salaryHistory = SalaryHistory.basic();
        }else {
            salaryHistory = employee.getSalaryHistory();
        }

        return salaryHistory.getMonthSalary();
    }
}
