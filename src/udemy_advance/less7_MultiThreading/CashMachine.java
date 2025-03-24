package udemy_advance.less7_MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CashMachine {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);

    }
}

class Employee extends Thread {
    String name;
    private Lock lock;
    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run() {
        if (lock.tryLock()) {
            try {
    //            System.out.println("Employee " + name + " is waiting");
    //            lock.lock();
                System.out.println("Employee " + name + " is doing operation");
                Thread.sleep(2000);
                System.out.println("Employee " + name + " ended all operations");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        } else {
            System.out.println("Employee " + name + " don't want to wait((((");
        }
    }
}

