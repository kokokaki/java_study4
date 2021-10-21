package day16.exception;

public class FinallyExample {

    public static void main(String[] args) {

        try {
            String s = "abc";
            s.equals("hello");
            System.out.println("s는 hello와 같다.");
        } catch (Exception e) {
            System.out.println("Null Pointer 예외 발생!");
        } finally {
            System.out.println("메롱");
        }

    }
}
