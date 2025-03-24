package udemy_advance.less7_MultiThreading;

public class SynchronizedBlock3 {
    static final Object lock = new Object();

    synchronized void mobileCall() throws InterruptedException {
        synchronized (lock){
            System.out.println("mobile call starts!");
            Thread.sleep(3000);
            System.out.println("mobile call ends!");
        }
    }

    synchronized void skypeCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("skypeCall call starts!");
            Thread.sleep(5000);
            System.out.println("skypeCall call ends!");
        }
    }

    synchronized void whatsAppCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("whatsAppCall call starts!");
            Thread.sleep(7000);
            System.out.println("whatsAppCall call ends!");
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();


    }

}


class RunnableImpMobile implements Runnable {
    @Override
    public void run() {
        try {
            new SynchronizedBlock3().mobileCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class RunnableImpSkype implements Runnable {
    @Override
    public void run() {
        try {
            new SynchronizedBlock3().skypeCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class RunnableImpWhatsApp implements Runnable {
    @Override
    public void run() {
        try {
            new SynchronizedBlock3().whatsAppCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
