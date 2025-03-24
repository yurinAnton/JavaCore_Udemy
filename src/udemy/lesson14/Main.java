package javastandart.lesson14;



public class Main {

    public void time(){

        OUTER: for (int hour=0; hour<=23 ;hour++){
            System.out.println("Start iterration");
            INNER: for (int min=0; min<=59 ;min++) {
                System.out.print(hour+":"+min + System.lineSeparator());
                if(min==30){continue INNER;}
            }
            System.out.println("End iterration");
//            if(hour==30){break OUTER;}
            System.out.println();

        }
    }

    public static void main(String[] args) {


//        for (int i=1; i <= 10; i+=2) {
//            System.out.println("Hello World");
//        }
//
//        for (int i=1, j=2, k=10; i <= 10; i+=2) {
//            System.out.println(i+" "+j+" "+k);
//        }
//
//        for (int i=1, j=2; i <= 10 && i>-3 || i>4; i+=2, j+=3, abc(10)) {
//            System.out.println(i);
//        }

//        for (int i=5; i <= 11; i++, abc(10)) {
//            System.out.println(i);
//        }

//        for (int i=1; i <= 10; i++) {
//            if(i==7){
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i=1; i <= 100; i++) {
//            if(i==10){
//                continue;
//            }
//            if(i%55==0){
//                break;
//            }
//            System.out.println(i);
//        }

        //-------------------------------------------

        Main m = new Main();
        m.time();


    }

//    static void abc(int n) {System.out.println(n);}

}
