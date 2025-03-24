package udemy_advance.less7_MultiThreading;

public class Wait_NotifyEx {
    public static void main(String[] args) {

        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

    }
}

class Market{
    private int breadCount = 0;
    private final Object lock = new Object();

    public void getBread() throws InterruptedException {
        synchronized (lock) {
            while(breadCount<1){
                lock.wait();
            }
            breadCount--;
            System.out.println("Customer brought 1 bread");
            System.out.println("Count bread: "+breadCount);
            lock.notify();
        }
    }

    public void setBread() throws InterruptedException {
        synchronized (lock) {
            while (breadCount >= 5) {
                lock.wait();
            }
            breadCount++;
            System.out.println("Produser put 1 bread");
            System.out.println("Count bread: " + breadCount);
            lock.notify();
        }
    }
}


class Producer implements Runnable{
    Market market;

    Producer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                market.setBread();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Consumer implements Runnable{
    Market market;

    Consumer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                market.getBread();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
