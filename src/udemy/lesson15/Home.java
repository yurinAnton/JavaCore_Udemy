package udemy.lesson15;

public class Home {



    public static void main(String[] args) {
        int hour = 0;
        int min = 0;
        int sec = 0;

        OUTER: while(hour<6) {
            MIDDLE: do {
                if(hour>1 && min%10==0) {break OUTER;}
                INNER: while(sec<=59) {

                    if(sec * hour > min) {continue MIDDLE;}
                    System.out.print(hour + ":" + min + ":" + sec + System.lineSeparator());
                    sec++;
                }
                min++;
            } while(min<=59);
            hour++;
        }
    }
}
