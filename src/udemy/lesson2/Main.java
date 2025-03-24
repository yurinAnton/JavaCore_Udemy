package udemy.lesson2;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        byte myByte = (byte) 12;
        convertByte(myByte);
        System.out.println();

        byte myByte1 = 0B1100;

        short myShort = -1300;
        convertShort(myShort);
        System.out.println();

        int myInt = 0;
        convertInteger(myInt);
        System.out.println();

        long mylong = 123456789;
        convertLong(mylong);
        System.out.println();

        float myFloat = 3.14f;
        float myFloat2 = 4.314f;
        System.out.println(myFloat);
        System.out.println(myFloat2);
        System.out.println();

        double myDouble = 9.361;
        double myDouble2 = 19.4;
        System.out.println(myDouble);
        System.out.println(myDouble2);
        System.out.println();

        boolean myBoolean = true;
        boolean myBoolean2 = false;
        System.out.println(myBoolean);
        System.out.println(myBoolean2);
        System.out.println();

        char myChar1 = 'H';
        char myChar2 = 'E';
        char myChar3 = 'L';
        char myChar4 = 'L';
        char myChar5 = 'O';
        String str = new String(new char[] { myChar1, myChar2, myChar3, myChar4, myChar5 });
        System.out.println(str);
    }

    public static void convertByte(byte byteNum) {
        String binary = Integer.toBinaryString(byteNum);
        String octal = Integer.toOctalString(byteNum);
        String hexadecimal = Integer.toHexString(byteNum).toUpperCase();

        System.out.println("Byte: " + byteNum);
        System.out.println("Byte to Binary: " + binary);
        System.out.println("Byte to Octal: " + octal);
        System.out.println("Byte to Hexadecimal: " + hexadecimal);
    }

    public static void convertShort(short shortNum) {
        String binary = Integer.toBinaryString(shortNum);
        String octal = Integer.toOctalString(shortNum);
        String hexadecimal = Integer.toHexString(shortNum).toUpperCase();

        System.out.println("Short: " + shortNum);
        System.out.println("Short to Binary: " + binary);
        System.out.println("Short to Octal: " + octal);
        System.out.println("Short to Hexadecimal: " + hexadecimal);
    }

    public static void convertInteger(int number) {
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hexadecimal = Integer.toHexString(number).toUpperCase();

        System.out.println("Int: " + number);
        System.out.println("Int to Binary: " + binary);
        System.out.println("Int to Octal: " + octal);
        System.out.println("Int to Hexadecimal: " + hexadecimal);
    }

    public static void convertLong(long LongNum) {
        String binary = Long.toBinaryString(LongNum);
        String octal = Long.toOctalString(LongNum);
        String hexadecimal = Long.toHexString(LongNum).toUpperCase();

        System.out.println("Long: " + LongNum);
        System.out.println("Long to Binary: " + binary);
        System.out.println("Long to Octal: " + octal);
        System.out.println("Long to Hexadecimal: " + hexadecimal);
    }

}
