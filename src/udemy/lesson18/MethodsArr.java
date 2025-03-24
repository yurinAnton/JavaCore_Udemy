package udemy.lesson18;

import java.util.Arrays;

public class MethodsArr {
    public static void main(String[] args) {

        int arr1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
        }

//        System.out.println();
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
        }

//        System.out.println();
//        System.out.println(Arrays.binarySearch(arr1, 5));
//        System.out.println(Arrays.binarySearch(arr1, 10));

        int arr2[] = {1, 9, 3, -8, 0, 5, 4, 1};

//        arr1 = arr2;
//        System.out.println(arr1 == arr2);
//        System.out.println(arr1.equals(arr2) );

        arr1[5-3] = 3;
//        arr2[arr1.length] = 10;

        // - Test
        int[][] array1 = new int[10][];
        Car[][][] array2 = new Car[1][0][7];
//        String array3[] = new array3[9]; // - new String надо
        java.lang.String[] array4[] = new java.lang.String[5][];
//        int[][] array5 = new int[]; // - не соответствует кол-во скобок и нет объявления длины
//        int[][] array6 = new int[][]; // - нет объявления длины
        int array7[] = {3, 5, 6, 0};
        int[] array8 = new int[5];
        int[] array9 = new int[]{};
//        int[] array10 = new int[2] {}; // - инициализирован массив с длиной 0 - {}, что не соответствует длине 2
//        int array11[] = new int[3] {0, 1, 2}; // - длины не соответствуют



        // --------------------------------Training

double [] array12 = {1.05, -1.0, -3.14, 8.0, 9.19, 0};
        Car cr = new Car();
        cr.maxMin(array12);

    }

}

class Car {

    public  void maxMin(double[] array) {
        double min = array[0];
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum = " + min + " Maximum = " + max);
    }
}

