package udemy.lesson18;

public class Main {


    public static void main(String[] args) {

        // - Declaration
        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] array10;
        int[] array11, array12; //- можно объявлять массивы чз ",";
        int b [], array22; // - так b понимается как массив, а array22 как переменная int
        int c[], d[][]; // - можно объявлять массивы разного уровня


        // - Allocation
        array1 = new int[10];
        array2 = new String[18];
        array3 = new double[4][2];
        array10 = new int[3][];

        System.out.println(array2.length);

        // - Static initialization
        array2[0] = "Hello, ";
        array2[1] = "world";
        array2[2] = "!";
//        System.out.println(array2);

        double[] array5;
        array5 = new double[3];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5;
        System.out.println(array3[1][0]);


        // - Dynamic initialization
        String[] array6;
        int[][] array7;


        array6 = new String[3];
        array7 = new int[3][];

        for (int i = 0; i < array6.length; i++) {
            array6[i] = "Hello -" + i;
            System.out.println(array6[i]);
        }

        array7[0] = new int[5];
        array7[1] = new int[2];
        array7[2] = new int[7];

        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                array7[i][j] = i + j;
                System.out.println(array7[i][j]);
            }
        }

        char [] array8 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String s = new String(array8);
        System.out.println(s);

        StringBuilder  sb = new StringBuilder("Hello world!");
        sb.append(array8, 2, 3);
        System.out.println(sb);
        System.out.println();

        sb.insert(2, array8, 1, 3);
        System.out.println(sb);


        // ----> MethodsArr

    }
}
