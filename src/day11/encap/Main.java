package day11.encap;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.engineStart();
        car.setMode('D');
        car.accelerator();
        car.accelerator();

        System.out.printf("지금 주행 속도는 %dkm/h입니다.\n"
                            , car.getSpeed());

        System.out.println("=======================");

        Driver kim = new Driver();
        Dealer park = new Dealer("박뽀로로");
        Dealer lee = new Dealer("이초코송이");

        kim.getLicense();
        kim.buyCar(park, "포르쉐 911");

        kim.drive();

    }
}
