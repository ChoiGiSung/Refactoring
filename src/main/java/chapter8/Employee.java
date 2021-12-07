package chapter8;


public abstract class Employee {

    private int type;
    public static final int ENGINEER1 = 1;
    public static final int ENGINEER2 = 2;
    public static final int ENGINEER3 = 3;

    public static Employee create(int type){
        switch (type){
            case ENGINEER1:
                return new Engineer1();
            case ENGINEER2:
                return new Engineer2();
            case ENGINEER3:
                return new Engineer3();
            default:
                throw new IllegalArgumentException();
        }
    }

    abstract int getType();
}
