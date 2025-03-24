package udemy.lesson28;

import java.time.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Test4 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2020, Month.NOVEMBER, 14);
        LocalDateTime ldt = LocalDateTime.of(2024, Month.NOVEMBER, 15, 1, 16, 40);
        LocalTime lt = LocalTime.of(20, 40, 30);

//        System.out.println(ld.getDayOfWeek());

//        System.out.println(lt.getNano());
//        System.out.println(lt.getSecond());
//        System.out.println(lt.getMinute());
//        System.out.println(lt.getHour());

//        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(d1));
//
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt);
//        System.out.println(lt.format(d2));

//        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(ldt);
//        System.out.println(ldt.format(d3));

//       DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//       System.out.println(ld);
//       System.out.println(ld.format(shortFormat));
//
//        DateTimeFormatter shortFormat2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//        System.out.println(lt);
//        System.out.println(lt.format(shortFormat2));
//
//        DateTimeFormatter shortFormat3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        System.out.println(ldt);
//        System.out.println(ldt.format(shortFormat3));

//        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, HH:mm");
//        System.out.println(ldt);
//        System.out.println(ldt.format(f));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2015", f);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2015-01-02");
        System.out.println(date2);


    }
}
