package day07;

public class MethodReturn {

    static int add(int n1, int n2) {
        return n1 + n2;

    }
    static void multi(int n1, int n2) {
        int result = add(n1, n2) * 10;
        System.out.println("result = " + result);
    }

    static void sayHello(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어요 즐!");
            return;
        }
        System.out.println(name + "님 하이~~");
    }

    //모든 메서드의 리턴값은 반드시 1개다.
    //2개의 정수를 받아서 덧셈결과, 뺄셈, 곱셈, 나눗셈을 리턴하고싶다.
    static int[] operateAll(int n1, int n2) {
        return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {

        System.out.println("메롱~~~");
        int total = add(10, 20);

        //void타입 메서드는 단독호출해서 사용함.
        multi(100, 20);

        double rn = Math.random();

        sayHello("김철수");
        sayHello("김코캌콜라맛있는펩시콜라맛없는815콜라");
    }
}
