package udemy_advance.less5_LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Sergey", 'm', 19, 4, 7.4);
        Student st3 = new Student("Anna", 'f', 18, 1, 7.0);
        Student st4 = new Student("Petr", 'm', 35, 5, 7.0);
        Student st5 = new Student("Maria", 'f', 23, 2, 9.2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo si2 = new StudentInfo();

        //---Sort
//        System.out.println(students);
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//        Collections.sort(students, (s1, s2) -> s1.course - s2.course);
//        System.out.println(students);

        //-----------------------------------------------------------

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        si2.testStudents(students, p1);
        System.out.println("--------------------------------------");
        si2.testStudents(students, p1.and(p2));

        System.out.println("--------------------------------------");
        si2.testStudents(students, p1.or(p2));

        System.out.println("--------------------------------------");
        si2.testStudents(students, p1.negate());
    }
}
