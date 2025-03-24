package javastandart.lesson15;

public class Main {
    public static void main(String[] args) {

//        int i = 1;
//        while(i<=10) {
//            System.out.println(i);
//            i++;
//        }

//        int money = 100;
//        while(money>0) {
//            System.out.println("Your bet!");
//            System.out.println("You lose!");
//            System.out.println();
//            money-=10;
//        }

//        boolean b = true;
//        int a = 1;
//        while (b) {
//            System.out.println(a);
//            if (a%3==0 && a%7==0) { b=false; }
//            a++;
//        }

        //-------------------------------------------do while

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while(i<=10);

        int hour = 0;
        OUTER: do{
            int min=0;
            INNER:
            while(min<60){
                System.out.println(hour + ":" + min + System.lineSeparator());
                min++;
            }
            hour++;
        } while(hour<24);

    }
}
