package udemy.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test10 {

    FileInputStream fis1, fis2;

    public void abc(){
        File f1 = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test10.txt");
        File f2 = new File("E:\\Lessons\\_JAVA_lessons\\JavaCore\\src\\udemy\\lesson27\\test11.txt");
        try{
            fis1 = new FileInputStream(f1);
            try{
                fis2 = new FileInputStream(f2);
            }
            catch(FileNotFoundException e){
                System.out.println("File - test11 not found");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File - test10 not found");
        }
        finally{
            System.out.println("This is finally!");
            try{
                fis1.close();
                fis2.close();
            }
            catch(IOException e){
                System.out.println("Exception in finally block!");
            }
        }
    }


    public static void main(String[] args)  {
        Test10 test = new Test10();
        test.abc();

    }
}
