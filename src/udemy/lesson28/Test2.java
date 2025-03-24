package udemy.lesson28;

import java.time.LocalDate;
import java.time.*;

public class Test2 {
//    static void schedule(LocalDate start, LocalDate end) {
//        LocalDate date = start;
//        while (date.isBefore(end)) {
//            System.out.println("Date: " + date + ". It's time to change duty student!");
//            date = date.plusMonths(1);
//        }
//    }

        static void schedule(LocalDate start, LocalDate end, Period p) {
        LocalDate date = start;
        while (date.isBefore(end)) {
            System.out.println("Date: " + date + ". It's time to change duty student!");
            date = date.plus(p);
        }
    }


    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2020, 9, 1);
        LocalDate end = LocalDate.of(2024, 5, 31);
//        Period p = Period.ofMonths(2);
//        schedule(start, end, p);

//        LocalTime lt = LocalTime.of(20,30);
//        Period p = Period.of(1, 3, 15);
//        lt.plus(p);



    }
}
