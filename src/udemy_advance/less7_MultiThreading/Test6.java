package udemy_advance.less7_MultiThreading;

public class Test6 extends Thread {

    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

//        for(int i=5; i>0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("Done");

        //----------------------------------------------------------

        Thread thread1 = new Thread(new MyRunnable());
        Test6 thread2 = new Test6();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("It's the end!");

    }
}


class MyRunnable implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
