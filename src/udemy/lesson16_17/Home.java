package udemy.lesson16_17;

public class Home {

    public static void main(String[] args) {

        Mail ml = new Mail();
        ml.e_mail("ya@yandex.ru; uyt@mail.ru; hhh@gmail.com");

    }
}

class Mail{

    public void e_mail(String str){
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < str.length() - 1) {

            a = str.indexOf('@', c);
            b = str.indexOf('.', c);
            c = str.indexOf(';', c + 1);
            System.out.println(str.substring(a + 1, b));
        }

    }

}
