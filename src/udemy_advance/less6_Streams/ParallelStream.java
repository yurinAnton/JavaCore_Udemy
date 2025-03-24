package udemy_advance.less6_Streams;

import java.util.*;

public class ParallelStream {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sumResult = list.parallelStream().reduce((acc, el) -> acc + el).get();
//        System.out.println(sumResult);


        double divResult = list.stream().reduce((acc, el) -> acc / el).get();
        System.out.println(divResult);

        double divResult2 = list.parallelStream().reduce((acc, el) -> acc / el).get();
        System.out.println(divResult2);
    }
}
