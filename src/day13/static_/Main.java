package day13.static_;

public class Main {


    public static void main(String[] args) {

        Count c1 = new Count();
        c1.x = 5;
        Count.y = 10;
        System.out.println("c1.x = " + c1.x);
        System.out.println("c1.y = " + c1.y);

        Count c2 = new Count();
        c2.x++;
        c2.y--;
        System.out.println("c2.x = " + c2.x);
        System.out.println("c2.y = " + c2.y);
        System.out.println("c1.y = " + c1.y);

        Count c3 = new Count();
        Count.y = 100;

        System.out.println("c1.y = " + c1.y);

        c1.m1();
        c2.m1();

        Count.m2();
        Count.m2();

        System.out.println("===============================");
        학생 김철수 = new 학생();
        학생 박영희 = new 학생();
        김철수.전공 = "경영학과";
        박영희.전공 = "수학과";

//        김철수.전공을물어보다();
//        박영희.전공을물어보다();

        학생.국적을물어보다(박영희);

    }
}
