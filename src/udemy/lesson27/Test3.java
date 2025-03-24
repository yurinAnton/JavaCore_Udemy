package udemy.lesson27;

import java.io.*;

public class Test3 {

    void abc() throws FileNotFoundException {

        File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test11.txt");

//        try {
            FileInputStream fis = new FileInputStream(f);
//            fis.read();
            System.out.println("Hello everybody");
//        }
//         catch (FileNotFoundException e) {
//            System.out.println("Was catched Exception!: " + e.getMessage());
//        }

    }

//    void def() {
//        System.out.println("Hello def");
//        try{
//            abc();
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Was catched Exception!: " + e.getMessage());
//        }
//
//    }


    public static void main(String[] args) {

//        File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test11.txt");

//        try {
//        FileInputStream fis = new FileInputStream(f);
//            fis.read();
//        System.out.println("Hello everybody");
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Was catched Exception!: " + e.getMessage());
//        }
//        catch (IOException e) {
//            System.out.println("Was catched Exception!: " + e.getMessage());
//        }
//        finally {
//            System.out.println("Finally block!");
//        }

        Test3 t = new Test3();

//        t.def();
//        try {
//            t.def();
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Was catched Exception!: " + e.getMessage());
//        }



    }
}
