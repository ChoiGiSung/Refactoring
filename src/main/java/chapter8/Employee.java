package chapter8;


public class Employee {

    private int type;
//    public static final int ENGINEER1 = 1;
//    public static final int ENGINEER2 = 2;
//    public static final int ENGINEER3 = 3;

    public int getType() {
        return type;
    }


    public static Employee createEngineer1(int type){
        return new Engineer1();
    }

    public static Employee createEngineer2(int type){
        return new Engineer2();
    }

    public static Employee createEngineer3(int type){
        return new Engineer3();
    }
}
