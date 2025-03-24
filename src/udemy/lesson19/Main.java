package udemy.lesson19;

public class Main {
    public static void main(String[] args) {
//        System.out.println("1st Element - " + args[0]);
//        System.out.println("Length of array" + args.length);

//        sum(6, 9);



        // VarArgs
        //------------------------------------------------

//        abc(2, new int[2]);
////        abc(2, {0, 1}); - не правильно, надо указать массив - new int
////        abc(1, {2}); - то же
//        abc(0, 1, 2);
//        abc(1, 2);
//        abc(3);
////        abc(); - необходимо передавать хотябы a

        abc(5);



    }

    static void sum(int ... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    static void abc(int a, int ... b) {
        System.out.println(b.length);
    }

    static void abc(int a) {
        System.out.println("Hello World");
    }

    static void abc(int ... b) {
        System.out.println("Goodbye!");
    }

}
