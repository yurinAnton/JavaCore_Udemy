package udemy_advance.less7_MultiThreading;

public class Test5 implements Runnable {
    public void run(){
        System.out.println("Method run. Thread name: " + Thread.currentThread().getName());

    }


    public static void main(String[] args) {

        Thread thread = new Thread(new Test5());
        thread.start();

        System.out.println("Main run. Thread name: " + Thread.currentThread().getName());
    }
}
