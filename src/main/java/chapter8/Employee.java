package chapter8;


public class Employee {

    private int type;
//    public static final int ENGINEER1 = 1;
//    public static final int ENGINEER2 = 2;
//    public static final int ENGINEER3 = 3;

    public int getType() {
        return type;
    }

    public Employee(int type) {
        this.type = type;
    }

    public static Employee createEngineer1(){
        return new Employee(1);
    }

    public static Employee createEngineer2(){
        return new Employee(2);
    }

    public static Employee createEngineer3(){
        return new Employee(3);
    }
}
