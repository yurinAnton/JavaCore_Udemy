package udemy.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {

        StringBuilder res = new StringBuilder("");

        try {
            File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test10.txt");
            System.out.println("File was created!");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream was created!");
            int counter = 0;
            while(true) {
                counter++;
                res.append(fis.read());
                System.out.println("Information is reading!");
                if(counter == 5) {fis.close();}
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Exception - 1 ");
        }
        catch(IOException e) {
            System.out.println("Exception - 2 " + e.getMessage());
        }
        finally {
            System.out.println("Finally!!!");
        }
    }
}
