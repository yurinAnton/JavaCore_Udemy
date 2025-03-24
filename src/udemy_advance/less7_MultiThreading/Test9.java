package udemy_advance.less7_MultiThreading;

public class Test9 {
    static int counter = 0;
    public static synchronized void incrementCounter() {counter++;}

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter);



    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Test9.incrementCounter();
        }
    }
}
