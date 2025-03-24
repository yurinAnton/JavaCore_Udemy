package udemy_advance.less6_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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


//        Map<Integer, List<Student>> map = students.stream().map(el -> {el.setName(el.getName().toUpperCase());
//        return el;
//        })
//                .collect(Collectors.groupingBy(el-> el.getCourse()));
//
//        for(Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//        }


        Map<Boolean, List<Student>> map2 =
                students.stream()
                .collect(Collectors.partitioningBy(el-> el.getAvgGrade() > 7.5));

        for(Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }



    }
}
