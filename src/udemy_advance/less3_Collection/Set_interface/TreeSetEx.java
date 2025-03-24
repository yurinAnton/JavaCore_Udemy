package udemy_advance.less3_Collection.Set_interface;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
//        greeSet.add(null);

//        treeSet.remove(2);
//        System.out.println(treeSet.contains(1));
//        System.out.println(treeSet);

        //------------------------------------

        TreeSet<Student> treeSet1 = new TreeSet<>();
        Student st1 = new Student("Zaur",  3);
        Student st2 = new Student("Mihail",  2);
        Student st3 = new Student("Sergey", 1);
        Student st4 = new Student("Andrey",  4);

        treeSet1.add(st1);
        treeSet1.add(st2);
        treeSet1.add(st3);
        treeSet1.add(st4);
        System.out.println(treeSet1);

//        System.out.println(treeSet1.first());
//        System.out.println(treeSet1.last());

        Student st5 = new Student("Oleg",  2);
        Student st6 = new Student("Ivan",  4);
//        System.out.println(treeSet1.headSet(st5));
//        System.out.println(treeSet1.tailSet(st5));

        System.out.println(treeSet1.subSet(st5, st6));

        System.out.println(st4.equals(st6));


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
