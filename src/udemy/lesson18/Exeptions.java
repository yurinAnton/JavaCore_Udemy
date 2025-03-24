package udemy.lesson18;

public class Exeptions {
    static String s;

    public static void main(String[] args) {

//        int [] array1 = new int [-10];

        // - ArrayIndexOutOfBoundsExeption
        int [] arr1 = new int [3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
//        arr1[3] = 4; // - exeption!, превышение длины массива

        // - NullPointerException
        int [][] arr2 = new int [3][];
//        System.out.println(arr2[0][1]); // - exeption!, отсутствует значение == (null)

        System.out.println(s.length());

    }
}
