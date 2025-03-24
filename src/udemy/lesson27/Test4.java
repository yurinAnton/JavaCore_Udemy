package udemy.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {

    void abc() throws FileNotFoundException {
        File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test11.txt");

        FileInputStream fis = new FileInputStream(f);
        System.out.println("Hello everybody");

//        int [] array = {1, 2};
//        System.out.println(array[5]);
    }

    void def() throws FileNotFoundException {
            abc();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Test4 t = new Test4();

        try {
            t.def();
        }
        catch (FileNotFoundException e) {
//            System.out.println("Exception was catched:  " + e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
