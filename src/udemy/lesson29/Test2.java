package udemy.lesson29;

import java.util.ArrayList;


public class Test2 {
    public static void main(String[] args) {
//
//        ArrayList<Student2> list = new ArrayList<>();
//        Student2 st1 = new Student2("Mike", 'm', 28, 2, 8.3);
//        Student2 st2 = new Student2("Bob", 'm', 25, 1, 6.4);
//        Student2 st3 = new Student2("Anna", 'f', 26, 1, 6.2);
//        Student2 st4 = new Student2("Gorge", 'm', 22, 4, 9.5);
//        Student2 st5 = new Student2("Linda", 'f', 24, 3, 5.2);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo2 si = new StudentInfo2();
//        FinedStudentsOverGrade fsog = new FinedStudentsOverGrade();
//        FinedStudentsUnderGrade fsug = new FinedStudentsUnderGrade();
//        FinedStudentsOverAge fsoa = new FinedStudentsOverAge();
//        FinedStudentsUnderAge fsua = new FinedStudentsUnderAge();
//        FinedStudentsBySex fsbs = new FinedStudentsBySex();
//        FinedStudentsMixConditions fsmc = new FinedStudentsMixConditions();
//
//        si.testStudents(list, fsog);
//        System.out.println("------------------------------------------------------------------------");
//        si.testStudents(list, fsug);
//        System.out.println("------------------------------------------------------------------------");
//        si.testStudents(list, fsoa);
//        System.out.println("------------------------------------------------------------------------");
//        si.testStudents(list, fsua);
//        System.out.println("------------------------------------------------------------------------");
//        si.testStudents(list, fsbs);
//        System.out.println("------------------------------------------------------------------------");
//        si.testStudents(list, fsmc);
//        System.out.println("------------------------------------------------------------------------");
//
//
//    }
//}
//
//class Student2{
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student2(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//
//}
//
//class StudentInfo2{
//    void printStudent(Student2 s){
//        System.out.println("Name of student: " + s.name + ", gender: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", avgGrade: " + s.avgGrade);
//    }
//    void testStudents(ArrayList<Student2> list, StudentChecks sc){
//        for(Student2 s : list){
//            if(sc.testStudent(s)){
//                printStudent(s);
//            }
//        }
//    }
//
//}
//
//interface StudentChecks{
//    boolean testStudent(Student2 s);
//}
//
//class FinedStudentsOverGrade implements StudentChecks{
//    public boolean testStudent(Student2 s){
//        return s.avgGrade > 8.5;
//    };
//}
//
//class FinedStudentsUnderGrade implements StudentChecks{
//    public boolean testStudent(Student2 s){
//        return s.avgGrade < 9;
//    };
//}
//class FinedStudentsOverAge implements StudentChecks{
//    public boolean testStudent(Student2 s){
//        return s.avgGrade > 25;
//    };
//}
//class FinedStudentsUnderAge implements StudentChecks{
//    public boolean testStudent(Student2 s){
//        return s.avgGrade < 26;
//    };
//}
//class FinedStudentsBySex implements StudentChecks{
//    public boolean testStudent(Student2 s){
//        return s.sex == 'm';
//    };
//}
//class FinedStudentsMixConditions implements StudentChecks{
//    public boolean testStudent(Student2 s){
//        return ((s.avgGrade > 5 && s.age < 29 && s.sex == 'f'));
    };
}