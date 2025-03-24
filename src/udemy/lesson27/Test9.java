package udemy.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {

    void abc() throws FileNotFoundException {
        try {
            File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test11.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            throw e;
        }
        finally {
            System.out.println("Finally! ");
        }
    }

    void method(){
        try{
            abc();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found! ");
        }
    }

//    void def() throws FileNotFoundException {
//        try {
//            int[] array = {1, 2, 3};
//            System.out.println(array[5]);
//        }
//        catch (IndexOutOfBoundsException e) {
//            System.out.println("Catched block ");
//            throw e;
//        }
//        finally {
//            System.out.println("Finally! ");
//        }
//    }


    public static void main(String[] args) {


    }
}
