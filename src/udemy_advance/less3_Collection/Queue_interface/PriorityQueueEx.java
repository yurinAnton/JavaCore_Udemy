package udemy_advance.less3_Collection.Queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueEx {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(2);
        pq.add(7);
        pq.add(10);
        pq.add(8);
        System.out.println(pq);

//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());

        //----------------------------------

        Student st1 = new Student("Zaur",  3);
        Student st2 = new Student("Mihail",  2);
        Student st3 = new Student("Sergey", 1);
        Student st4 = new Student("Andrey",  4);
        Student st5 = new Student("Igor",  5);
        PriorityQueue<Student> pQueue = new PriorityQueue<>();
        pQueue.add(st1);
        pQueue.add(st2);
        pQueue.add(st3);
        pQueue.add(st4);
        pQueue.add(st5);
        System.out.println(pQueue);

        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.course-o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

}

