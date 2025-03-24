package udemy_advance.less3_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx {
    public static void main(String[] args) {

        Map<Student2, Double> map = new HashMap<>();
        Student2 st1 = new Student2("Zaur", "Trigulov", 3);
        Student2 st2 = new Student2("Mihail", "Sergeev", 2);
        Student2 st3 = new Student2("Sergey", "Mihaylov", 1);
        map.put(st1, 7.5);
        map.put(st2, 6.3);
        map.put(st3, 8.6);
        System.out.println(map);
        System.out.println(map.containsKey(st1));
//        st1.course = 4;
        System.out.println(map);
        System.out.println(map.containsKey(st1));

//        Student2 st4 = new Student2("Zaur", "Trigulov", 4);
//        Student2 st5 = new Student2("Igor", "Sidorovv", 4);
//        boolean res = map.containsKey(st4);
//
//        System.out.println(res);
//        System.out.println(st1.equals(st4));

//        System.out.println(st1.hashCode());
//        System.out.println(st2.hashCode());
//        System.out.println(st1.hashCode());
//        System.out.println(st4.hashCode());

//        for (Map.Entry<Student2, Double> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);

    }
}


final class Student2 implements Comparable<Student2> {
    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }

    final String name;
    final String surname;
    final int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student2 student2 = (Student2) o;
//        return course == student2.course && Objects.equals(name, student2.name) && Objects.equals(surname, student2.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

}
