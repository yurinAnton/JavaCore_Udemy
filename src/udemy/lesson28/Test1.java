package udemy.lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test1 {
    public static void main(String[] args) {

//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        System.out.println(ld1);

        LocalDate ld2 = LocalDate.of(2024, Month.NOVEMBER, 14);
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(18, 9, 30);
        System.out.println(lt1);

        LocalTime lt2 = LocalTime.of(12, 20, 15);
        System.out.println(lt2);

        LocalDateTime ldt1 = LocalDateTime.of(2015, Month.SEPTEMBER, 15, 20, 5);
        System.out.println(ldt1);

        LocalDateTime ldt2 = LocalDateTime.of(2024, Month.NOVEMBER, 10, 17, 25);
        System.out.println(ldt2);

//        LocalDateTime ldt2 = LocalDateTime.of(ld2, lt1);
//        System.out.println(ldt2);

//        ld1 = ld1.plusDays(25);
//        System.out.println(ld1);
//        ld1 = ld1.minusDays(25);
//        System.out.println(ld1);
//        ld1 = ld1.plusWeeks(6);
//        System.out.println(ld1);
//        ld1 = ld1.minusWeeks(6);
//        System.out.println(ld1);

//        ld1 = ld1.minusWeeks(6).plusDays(25).minusMonths(6);
//        System.out.println(ld1);

//        ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(3).minusSeconds(30);
//        System.out.println(ldt1);

        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isBefore(ld2));


    }
}
