package udemy_advance.less11_Enum_Scaner_Anno.Scanner;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Scenner2 {
    public static void main(String[] args) {

        Scanner sc= null;
        Set<String> set = new TreeSet<>();
        try{
            sc= new Scanner(new FileReader(new File("/udemy_advance/less11_Enum_Scaner_Anno/Scanner/app.txt")));
            sc.useDelimiter("\\W");
            while(sc.hasNext()){
                String word = sc.next();
                set.add(word);
            }
            for(String word : set){
                System.out.println(word);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            sc.close();
        }


    }
}
