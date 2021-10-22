package day17.inter;

public interface Pet {

    //인터페이스에는 상수필드만 선언가능
    int ABC = 100;

    //인터페이스는 기본적으로 추상메서드만 선언할 수 있음.
    //사료를 먹다
    void feeding();
}
