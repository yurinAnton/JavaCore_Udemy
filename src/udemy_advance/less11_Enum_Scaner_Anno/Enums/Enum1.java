package udemy_advance.less11_Enum_Scaner_Anno.Enums;

import java.util.Arrays;

public class Enum1 {

    public static void main(String[] args) {
        Today today = new Today(Weekdays.SUNDAY);
        today.daysInfo();

        Weekdays w1 = Weekdays.FRIDAY;
        Weekdays w2 = Weekdays.FRIDAY;
        Weekdays w3 = Weekdays.MONDAY;

//        System.out.println(w1==w2);
//        System.out.println(w1==w3);
//
//        System.out.println(Weekdays.FRIDAY.equals(Weekdays2.FRIDAY));

        Weekdays w4 = Weekdays.valueOf("FRIDAY");
        System.out.println(w4);

        Weekdays[] array = Weekdays.values();
        System.out.println(Arrays.toString(array));

    }

}

enum Weekdays{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
    private Weekdays(String mood){
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}

enum Weekdays2{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}


class Today{

    Weekdays weekday;
    public Today(Weekdays weekday){
        this.weekday = weekday;
    }

    void daysInfo(){
        switch (weekday){
            case MONDAY:
                case TUESDAY:
                    case WEDNESDAY:
                        case THURSDAY:
                            case FRIDAY:
                                System.out.println("It's time go to work!");
                                break;
                                case SATURDAY:
                                    case SUNDAY:
                                        System.out.println("Relax - it's weekend!");
                                        break;
        }
        System.out.println("Mood is " + weekday.getMood());
    }


}
