package day14.poly.car;

public abstract class Car {

    //주행 기능
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
    //감속 기능
    public abstract void downSpeed();
}
