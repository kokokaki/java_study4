package day17.api.lang.wrapper;

public class Wrapper {

    static int x;
    static Integer y;

    public static void main(String[] args) {

        x = 10; y = 20;

        y = x;
        x = y;

        //문자열 -> 기본타입 변환
        String s1 = "90";
        String s2 = "5.5";
        System.out.println(s1 + s2);

        System.out.println(Integer.parseInt(s1) + Double.parseDouble(s2));
    }
}
