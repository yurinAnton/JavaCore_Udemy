package udemy.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {

//    static int abc(){
//        int a = 5;
//        try {
//            File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test11.txt");
//            FileInputStream fis = new FileInputStream(f);
////            return a;
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("File not found");
//            System.out.println("Catch block! var a = " + a);
//            return a;
//        }
//        finally {
//            a=10;
//            System.out.println("Finally! var a = " + a);
////            return a;
//        }
//        return a;
//    }

//-----------------------------------------------------
    static StringBuilder abc(){
        StringBuilder a = new StringBuilder("hello");
        try {
            File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test11.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("Catch block! var a = " + a);
            return a;
        }
        finally {
            a.append("!!!!");
            System.out.println("Finally! var a = " + a);
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(abc());


    }
}
