package udemy_advance.less7_MultiThreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main starts!");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);

        thread.interrupt();

        thread.join();
        System.out.println("Main ends!");

    }
}

class InterruptedThread extends Thread {
    double sqrSum = 0;

    public void run() {
        for (int i = 1; i < 1000000000; i++) {
            if(isInterrupted()) {
                System.out.println("Thread is going interrupted!");
                System.out.println(sqrSum);
                return;
            }
            sqrSum = Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread is going interrupted, during sleep. Let's end job of thread!");
                System.out.println(sqrSum);
                return;
            }
        }
        System.out.println(sqrSum);
    }
}

