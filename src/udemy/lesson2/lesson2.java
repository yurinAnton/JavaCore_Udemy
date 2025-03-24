package udemy.lesson2;

public class lesson2 {
    public static void main(String[] args) {

        byte myByte = (byte) 12;
        byte myByte1 = 0B1100;
        byte myByte2 = 014;
        byte myByte3 = 0XC;
        System.out.println(myByte);
        System.out.println(myByte1);
        System.out.println(myByte2);
        System.out.println(myByte3);

        short myShort = 1300;
        short myShort1 = 0B0001001100000000;
        short myShort2 = 02424;
        short myShort3 = 0X514;
        System.out.println(myShort);
        System.out.println(myShort1);
        System.out.println(myShort2);
        System.out.println(myShort3);

        int myInt= 0;
        int myInt1= 0B0;
        int myInt2= 00;
        int myInt3= 0X0;
        System.out.println(myInt);
        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);

        long myLong= 12345678998745L;
        long myLong1= 0B111010110111100110100010101;
        long myLong2= 0726746425;
        long myLong3= 0X75BCD15;
        System.out.println(myLong);
        System.out.println(myLong1);
        System.out.println(myLong2);
        System.out.println(myLong3);

    }
}
