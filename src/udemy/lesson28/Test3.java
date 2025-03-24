package udemy.lesson28;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2020, Month.NOVEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2024, Month.NOVEMBER, 15, 1, 16, 40);
//        Period p = Period.ofMonths(3).ofDays(10);
//        Period p = Period.ofMonths(3);
//        p = Period.ofDays(10);
//        System.out.println(start.plus(p));

        LocalTime date = LocalTime.of(10, 30);
        Duration d = Duration.ofHours(10);
//        System.out.println(date.plus(d));

        System.out.println(ldt.plus(d));



    }
}
