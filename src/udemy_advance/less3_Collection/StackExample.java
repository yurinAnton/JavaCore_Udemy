package udemy_advance.less3_Collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

//        System.out.println("main starts");
//        abc3();
//        System.out.println("main ends");

        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Katya");
        System.out.println(stack);
//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        System.out.println(stack.peek());
        System.out.println(stack);



    }

    static void abc1(){
        System.out.println("abc1 starts");
        System.out.println("abc1 ended");
    }
    static void abc2(){
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ended");
    }
    static void abc3(){
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ended");
    }
}
