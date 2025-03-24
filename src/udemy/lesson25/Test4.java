package udemy.lesson25;

public class Test4 {
    public static void main(String[] args) {

//        String[] array1 = {"Hello", "World"};
//        Object[] array2 = array1;
//        String[] array3 = (String[])array2;
//
////        array3[0] = new StringBuilder();
//        array2[0] = array3[0];

        //------------------------------------

        Test30 t3 = new Test30();
        System.out.println(((Test10)t3).a);
        ((Test20)t3).abc();

    }
}

class Test10{
    int a = 10;
    void abc(){System.out.println("Ok- 10");}
}

class Test20 extends Test10{
    int a = 20;
    void abc(){System.out.println("Ok- 20");}
}

class Test30 extends Test20{
    int a = 30;
    void abc(){
        System.out.println("Ok- 30");}
}