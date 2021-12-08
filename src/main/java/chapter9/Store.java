package chapter9;

public class Store {

    //가게의 직원.
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void addEmployee(Employee employee) {
        this.employee = employee;
    }
}
