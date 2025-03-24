package udemy.lesson26;

public class Test5 {

    {
        System.out.println("This is initializer block - 3");
    }

    Test5(){
        System.out.println("This is constructor - 1");
    }

    Test5(int a){
        this();
        System.out.println("This is constructor - 2");
    }

    {
        System.out.println("This is initializer block - 1");
    }

    static {
        System.out.println("This is initializer block - static");
    }

    {
        System.out.println("This is initializer block - 2");
    }

    static {
        System.out.println("This is initializer block - static - 2");
    }

    public static void main(String[] args) {

        Test5 t1 = new Test5();
        Test5 t2 = new Test5(3);

    }
}
