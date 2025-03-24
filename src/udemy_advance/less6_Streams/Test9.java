package udemy_advance.less6_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Sergey", 'm', 19, 2, 7.4);
        Student st3 = new Student("Anna", 'f', 18, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 5, 7.0);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.2);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
//
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(max);


//        students.stream().filter(student -> student.getAge() > 20).forEach(System.out::println);
//        System.out.println("----------------------------------------------");
//        students.stream().filter(student -> student.getAge() > 20).limit(2).forEach(System.out::println);
//        System.out.println("----------------------------------------------");
//        students.stream().filter(student -> student.getAge() > 20).skip(2).forEach(System.out::println);


        List<Integer> cources =  students.stream().mapToInt(el -> el.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(cources);


    }
}
