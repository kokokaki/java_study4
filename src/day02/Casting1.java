package day02;

public class Casting1 {

    public static void main(String[] args) {

        //묵시적 형변환(promotion, upcasting)
        byte a = 100; // 1바이트

        //byte -> int 묵시적 형변환
        int b = a;    // 4바이트

        double c = b;
        System.out.println("c = " + c);

        //명시적 형변환 (downcasting)
        int n = 1000;
        byte m = (byte)n;
        System.out.println("m = " + m);

        int money = 2000;
        double price = 600.0;

        int result = (int) (money / price);
        System.out.println("result = " + result);

        char r = 'A';
        int o = r;
        System.out.println("o = " + o);

        short p = (byte) o;

    }
}
