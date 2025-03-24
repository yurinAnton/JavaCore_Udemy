package udemy.lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Home {

    public ArrayList<String> abc(String... s) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s1: s){
            if(!aL.contains(s1)) {
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {

        Home h = new Home();
        h.abc("Hello", "World", "privet", "poka", "World");

    }
}
