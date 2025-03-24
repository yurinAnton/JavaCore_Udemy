package udemy_advance.less6_Streams;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Sergey", 'm', 19, 4, 7.4);
        Student st3 = new Student("Anna", 'f', 18, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 5, 7.0);
        Student st5 = new Student("Maria", 'f', 23, 2, 9.2);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(faculty -> faculty
                .getStudentsOnFaculty()
                .stream())
                .forEach(e -> System.out.println(e.getName()));


    }
}


class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}

