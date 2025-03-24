package udemy_advance.less11_Enum_Scaner_Anno.Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter an integer: ");
//        int num = sc.nextInt();
//        System.out.println("Number is: " + num);

//        System.out.println("Enter 2 numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("Divide is: " + (a / b));
//        System.out.println("Rest is: " + (a % b));

//        System.out.println("Enter two words: ");
//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        System.out.println(word1 + " " + word2);


        Scanner sc1 = new Scanner("Hello my friend! \n How are you? \n How your brother?");
//        System.out.println(sc1.next());
//        System.out.println(sc1.next());
//        System.out.println(sc1.next());
//        System.out.println(sc1.next());
//        System.out.println(sc1.next());
//        while (sc1.hasNextLine()) {
//            System.out.println(sc1.next());
//        }

        System.out.println(sc1.nextLine().charAt(2));


    }
}
