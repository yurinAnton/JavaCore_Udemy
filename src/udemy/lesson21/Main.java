package udemy.lesson21;

public class Main {
    public static void main(String[] args) {

//        int a= 4;
//        System.out.println((a<4) ? true : false);

//        int b= 5;
//        int c= 5;
//        int d= (b< 6) ? b++ : c++;
//        System.out.println(b);
//        System.out.println(c);

        //--------------------------------------

//        String s1 = new String("Hello");
//        String s2 = new String("Goodbye");
//        s1 = s2;
//        String s3 = s1;
//        s1 = null;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);


//        Test t = new Test();

        Test3 t5 = new Test3();
        char c = 'a';
        t5.abc(c);

        int a = new Test4().abc();

//        Test4 t4 = new Test4();
//        t4.abc3(1, 2);


    }
}

class Test{
//    public Test(){
////        this();
//    }
    void Test(){
        System.out.println("This is a method");
    }
    Test(){
        System.out.println("This is constructor");
    }
    int Test = 3;

}

class Test2{

    public void abc(String s){
        System.out.println(s);
    }
    public void abc(Boolean b){
        System.out.println(b);
    }
    private StringBuilder abc(StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("goodbye");
    }

}

class Test3{
    void abc(int i){
        System.out.println(i);
    }

}

class Test4{
    int abc(){
        return 5;
    }
    int abc2(int i){
        if(i>10) {return 5;}
        else {return 10;}
    }
    public void abc3(int a, double d) {
        System.out.println("Hello World");
    }
    public void abc3(double d, int a) {
        System.out.println("Poka");
    }
}



