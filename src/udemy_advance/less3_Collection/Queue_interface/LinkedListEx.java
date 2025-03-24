package udemy_advance.less3_Collection.Queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Igor");
        queue.add("Anton");
        queue.add("Maria");
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());

        System.out.println(queue);

    }
}
