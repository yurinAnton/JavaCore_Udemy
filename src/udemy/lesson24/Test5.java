package udemy.lesson24;

public class Test5 {
    public static void main(String[] args) {
//        Z z = new Z();
//
//        z.abc();
//        z.def();
//        z.fgh();

        I1.qwe();
        I2.qwe();
    }
}

interface I1 {
//    void abc();
//    default void fgh() {System.out.println("This is a method - fgh");}
    default void def() {System.out.println("This is a method - def");}
    static void qwe() {System.out.println("This is a static method - qwe");}
}
interface I2 {
    default void def() {System.out.println("This is a method - def");}
    static void qwe() {System.out.println("This is a static method - qwe");}
}


interface I3 extends I1 {
    void def();
}

//abstract class R implements I1 {
//    public abstract void def();
//}
//abstract class R implements I1, I2 {
//
//}


//class Z implements I1 {
//    public void abc() {
//        System.out.println("This is a method - abc");
//    }
//    public void fgh() {System.out.println("This is a method - fgh");}
//}
