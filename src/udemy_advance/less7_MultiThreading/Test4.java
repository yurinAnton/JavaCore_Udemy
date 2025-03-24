package udemy_advance.less7_MultiThreading;

public class Test4 {
    public static void main(String[] args) {

        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("MyThread-5!");
        myThread5.setPriority(9);
        System.out.println("Name of myThread5: " + myThread5.getName() + " | Priority of myThread5: " + myThread5.getPriority());



    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
}

