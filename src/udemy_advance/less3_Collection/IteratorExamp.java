package udemy_advance.less3_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorExamp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Anton");
        list.add("Bill");
        list.add("Anna");
        list.add("Igor");
        list.add("Elena");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            iterator.next();
            iterator.remove();

        }

        System.out.println(list);
    }
}
