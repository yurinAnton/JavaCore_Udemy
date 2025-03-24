package udemy.lesson27;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {

        File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test10.txt");

        FileInputStream fis = new FileInputStream(f);
        System.out.println("File was found");
        fis.read();

//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(100);



    }
}
