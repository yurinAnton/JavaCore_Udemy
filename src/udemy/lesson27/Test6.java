package udemy.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test11.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch(FileNotFoundException e) {
            System.out.println("Exception 1:  " + e.getMessage());
        }
        catch(NullPointerException e) {
            System.out.println("Exception 2:  " + e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Exception 3:  " + e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Exception 4:  " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Exception 5:  " + e.getMessage());
        }
    }
}
