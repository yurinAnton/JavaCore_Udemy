package udemy_advance.less7_MultiThreading;

public class Test3 {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello World");
            }
        }).start();

        new Thread(() -> System.out.println("hello World")).start();


    }
}
