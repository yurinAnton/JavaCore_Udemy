package udemy_advance.less3_Collection;

import java.util.*;

public class ListIteratorEx {
    public static void main(String[] args) {

        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char c : s.toCharArray()){
            list.add(c);
        }
//        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> revIterator = list.listIterator(list.size());
        boolean isPalendrom = true;

        while(iterator.hasNext() && revIterator.hasPrevious()){
            if(iterator.next() != revIterator.previous()){
                isPalendrom = false;
                break;
            }
        }
        if(isPalendrom){
            System.out.println("It's a palendrom");
        } else {
            System.out.println("It's not a palendrom");
        }

    }
}
