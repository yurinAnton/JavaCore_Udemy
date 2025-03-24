package udemy_advance.less7_MultiThreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();



    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1: It's trying to get monitor of lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread1: Monitor of lock1 - is captured!");
            System.out.println("Thread1: It's trying to get monitor of lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread1: Monitors of lock1 and lock2 - is captured!");
            }
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread2: It's trying to get monitor of lock2");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread2: Monitor of lock2 - is captured!");
            System.out.println("Thread2: It's trying to get monitor of lock1");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread2: Monitors of lock1 and lock2 - is captured!");
            }
        }
    }
}
