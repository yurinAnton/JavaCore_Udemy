package udemy.lesson19;

public class Foreach {


    public static void main(String[] args) {

//        int [] array1 = {0, 6, 4, 1};
//        for(int i=1; i< array1.length; i++){
//            System.out.print(array1[i] + " ");
//        }
//        for(int a : array1) {
//            System.out.print(a + " ");
//        }

//        int sum = 0;
//        for(int a : array1) {
//            sum += a;
//        }

//        String [] students = {"Ivanov", "Petrov", "Sidorov"};
//        String [] exams = {"Math", "philosophy", "history"};
//
//        for(String a : students) {
//            for(String b : exams) {
//                System.out.println(a + " - " + b);
//            }
//        }


        //----------------------------------------------------
//        int [][] array2 = {{6, 4, 1}, {4, 5}, {9, 4, 4, 6, 8, 3}};

//        for(int x = 0; x < array2.length; x++){
//            for(int y = 0; y < array2[x].length; y++){
//                System.out.print(array2[x][y] + " ");
//            }
//        }

//        for (int[] arr : array2 ) {
//            for (int arr1 : arr) {
//                System.out.print(arr1 + " ");
//            }
//        }

        //-----------------------------------------------------

//        String[] array3 = {"hello", "Hi", "Bye"};
//        StringBuilder sb1 = new StringBuilder("privet");
//        StringBuilder sb2 = new StringBuilder("poka");
//        StringBuilder sb3 = new StringBuilder("ok");
//        StringBuilder[] array4 = {sb1, sb2, sb3};
//
//        for(StringBuilder sb : array4) {
////            sb = new StringBuilder("Hello");
//            sb.append("-Java ");
//        }
//
//        for(int i=0; i<array4.length; i++) {
//            System.out.print(array4[i] + " ");
//        }

//        for(String s : array3) {
//            s = new String("hello");
//            System.out.print(s + " ");
//        }

        //-------------------------------------------------

//        int [] array5 = new int[4];
//        for (int i = 0; i < array5.length; i++) {
//            array5[i] = i*10;
//        }
//
//        for (int a : array5) {
//            System.out.print(a + " ");
//        }

        //------------------------------------------------

        int[] array6 = {3, 1, -2, 0};
        int[] array7 = {-9, 1, 5, 2};
        for (int i = 0; i < array6.length && i < array7.length; i++) {
            array6[i] = 12;
            array7[i] = 3;
        }


    }
}
