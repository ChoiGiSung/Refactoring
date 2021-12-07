package chapter8;

import lombok.Getter;

@Getter
public class Employee {

    private int type;
    private static final int ENGINEER1 = 1;
    private static final int ENGINEER2 = 2;
    private static final int ENGINEER3 = 3;

    private Employee(int type) {
        this.type = type;
    }

    public static Employee create(int type){
        return new Employee(type);
    }
}
