package udemy_advance.less5_LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Hello");
        al.add("Goodbye");
        al.add("Ok");
        al.add("Learn Java");
        al.add("Learning Lambda");

//        al.removeIf(element -> element.length() < 6);

        Predicate<String> p = element -> element.length() < 6;
        al.removeIf(p);

        System.out.println(al);

    }
}
