package udemy_advance.less5_LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;


public class StudentInfo {

//    void testStudents(ArrayList<Student> al, StudentChecks sc) {
//        for (Student s : al) {
//            if(sc.check(s)){
//                System.out.println(s);
//            }
//        }
//    }

    void testStudents(ArrayList<Student> al, Predicate<Student> p) {
        for (Student s : al) {
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }


    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Sergey", 'm', 19, 4, 7.4);
        Student st3 = new Student("Anna", 'f', 18, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 5, 7.0);
        Student st5 = new Student("Maria", 'f', 23, 2, 9.2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo si = new StudentInfo();
//        si.printStudentOverGrade(students, 8);
//        System.out.println("------------------------------");
//        si.printStudentUndeerAge(students, 30);
//        System.out.println("------------------------------");
//        si.printStudentMixCondition(students, 20, 9.5, 'f');

        //------------------------------------------------------------------

//        si.testStudents(students, new checkOverGrade() {});
//        System.out.println("------------------------------");
//        si.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });

        //---Lambda ->
//        System.out.println("------------------------------");
//        si.testStudents(students, (Student s) -> s.avgGrade > 8); // Lambda Expression
//        System.out.println("------------------------------");
//        si.testStudents(students, (Student s) -> s.age < 30); // Lambda Expression
//        System.out.println("------------------------------");
//        si.testStudents(students, (Student s) -> {return s.age > 20 && s.avgGrade < 9.5 && s.sex == 'f';}); // Lambda Expression

        //--------------------------------------------------------

//        si.testStudents(students,  s -> s.avgGrade > 8);

        //--------------------------------------------------------

//        StudentChecks sc = (Student s) -> s.avgGrade > 8;

        //--------------------------------Function

        Function<Student, Double> f = student -> student.avgGrade;

        double res = avgOfSmth(students, stud -> stud.avgGrade);
        System.out.println(res);
        double res2 = avgOfSmth(students, stud -> (double)stud.course);
        System.out.println(res2);
        double res3 = avgOfSmth(students, stud -> (double)stud.age);
        System.out.println(res3);


    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for(Student s : list) {
            result += f.apply(s);
        }
        return result / list.size();
    }

//    void printStudentOverGrade(ArrayList<Student> al, double grade){
//        for(Student s : al){
//            if(s.avgGrade > grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentUndeerAge(ArrayList<Student> al, int age){
//        for(Student s : al){
//            if(s.age > age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex){
//        for(Student s : al){
//            if(s.age > age && s.avgGrade < grade && s.sex==sex){
//                System.out.println(s);
//            }
//        }
//    }

}

//interface StudentChecks {
//    boolean check(Student s);
//}
//
//class checkOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}
