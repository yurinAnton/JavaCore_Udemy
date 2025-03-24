package udemy_advance.less3_Collection.Queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(1);
        deque.offerFirst(7);
        deque.offerLast(10);
        System.out.println(deque);

    }
}
