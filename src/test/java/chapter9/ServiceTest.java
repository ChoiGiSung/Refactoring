package chapter9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ServiceTest {

    Service service = new Service();

    @Test
    void getEmployeeSalaryZero() {
        Store store = new Store();

        int employeeSalary = service.getEmployeeSalary(store);

        assertThat(employeeSalary).isEqualTo(0);
    }

    @Test
    void getEmployeeSalaryThousand() {
        Store store = new Store();
        store.addEmployee(new Employee(1000));

        int employeeSalary = service.getEmployeeSalary(store);

        assertThat(employeeSalary).isEqualTo(1000);
    }
}