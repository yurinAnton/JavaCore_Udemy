package udemy.lesson26;

public class Test6 {
    int a= 3;

    Test6(){
        a= 4;
    }

    {
        a= 5;
    }


    public static void main(String[] args) {

//        Test6 t = new Test6();
//        System.out.println(t.a);

        C c = new C();

    }
}

class A{
    static final int b;
    int a = 5;
    static{
        b = 10;
    }
}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;
    static{
        c=5;
        d=3;
//        e=2;
        f=1;
    }
}

class C {
    String s = "hello";
    {
        System.out.println(s);
    }
    static int i = 0;
    static{
        System.out.println(i);
    }
    static{
        i+=1;
        System.out.println(i);
    }
    C(){
        System.out.println("This is constructor");
    }
}

