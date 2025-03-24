package udemy.lesson10.p4;

import udemy.lesson10.p1.A;
import udemy.lesson10.p1.p2.p3.C;
import udemy.lesson10.p4.p5.E;
import static udemy.lesson10.p1.p2.B.*;


public class D {
    public static void main(String[] args) {
        A objA = new A();
        C objC = new C();
        E objE = new E();

        System.out.println(objA.a);
        objC.f();
        objE.E("hello!");

        System.out.println(STR);
        foo();

    }
}
