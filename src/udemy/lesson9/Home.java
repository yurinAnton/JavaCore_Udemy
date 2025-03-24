package udemy.lesson9;

public class Home {

    public static void abc(){
        String s1 = new String("abc");
        String s2 = new String("dfg");
    }

//    public static void main(String[] args) {
//        Home obj = new Home();
//        obj.abc();
//        obj.abc();
//        String s1 = new String("abc");
//        abc();
//    }
}

//class Test1 {
//    int a = 1;
//    static int b = 2;
//
//    void abc(int a) {
//        System.out.println(a);
//        System.out.println(this.a);
//    }
//
//    public static void main(String[] args) {
//        Test1 t = new Test1();
//        t.abc(3);
//    }
//}

//class Test2 {
//    int a = 1;
//    static int b = 2;
//
//    static void abc(final int a) {
//        System.out.println(a);
//        System.out.println(Test2.b);
//    }
//    public static void main(String[] args) {
//        abc(5);
//    }
//}

class Test3{
    int a = 1;
    static int b = 2;

    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}

