package udemy_advance.less7_MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx {
    public static void main(String[] args) {

//        ExecutorService executor = Executors.newFixedThreadPool(5);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executor.execute(new RunnableImp100());
        }

        executor.shutdown();
//        try {
//            executor.awaitTermination(5, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Main ends!");

    }
}

class RunnableImp100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Work begins");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}

