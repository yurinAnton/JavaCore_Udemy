package udemy_advance.less3_Collection;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student st1 = new Student("Mike", 3);
        Student st2 = new Student("Nikola", 2);
        Student st3 = new Student("Boris", 1);
        Student st4 = new Student("Anna", 4);
        Student st5 = new Student("Nika", 3);

        LinkedList<Student> students = new LinkedList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println("LinkedList: " + students);
//        System.out.println(students.get(2));

        Student st6 = new Student("Igor", 3);
        Student st7 = new Student("Zaur", 4);

        students.add(st6);
        System.out.println("LinkedList: " + students);

        students.add(1, st7);
        System.out.println("LinkedList: " + students);

        students.remove(3);
        System.out.println("LinkedList: " + students);

    }
}

class Student {
    String name;
    int cource;

    public Student(String name, int cource) {
        this.name = name;
        this.cource = cource;
    }

    @Override
    public String toString() {
        return "Student { name=" + name + ", cource=" + cource + " }";
    }

}
