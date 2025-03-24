package udemy_advance.less7_MultiThreading;

public class Test2 extends Thread {

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

//        Thread t1 = new Thread(new MyThread3());
//        Thread t2 = new Thread(new MyThread4());
//        t1.start();
//        t2.start();

        Test2 t = new Test2();
        t.start();


        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }




    }
}

//class MyThread3 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable {
//    public void run() {
//        for (int i = 1000; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}