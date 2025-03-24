package udemy.lesson27;

public class Test5 {

    static void abc(){
        System.out.println("abc - method");
        abc();
    }

    public static void main(String[] args) {

        try {
            abc();
        }
        catch (StackOverflowError e) {
            System.out.println("Error " + e);
        }



    }
}
