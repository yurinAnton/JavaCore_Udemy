package udemy.lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test12 {

    static FileInputStream fis1, fis2;

    public static void main(String[] args) {

        try{
            fis1 = new FileInputStream("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test10.txt");
            System.out.println("File Test10 was found");
            try{
                fis2.close();
            }
            catch(IOException e){
                System.out.println("It's problem with stream - fis2!");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File test10 not found!");
        }
        catch(NullPointerException e){
            System.out.println("Worked NullPointerException!");
        }

    }
}
