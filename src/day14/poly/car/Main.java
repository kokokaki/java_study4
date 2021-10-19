package day14.poly.car;

public class Main {

    public static void main(String[] args) {

        Tucson t = new Tucson();
        Sonata s = new Sonata();
        Boxster b = new Boxster();

        Car[] cars = {t, s, b, new Tucson(), new Boxster()};
        for (Car c : cars) {
            c.run();
        }
        System.out.println("========================");

        Driver park = new Driver();
        park.drive(s);
        park.drive(new Tucson());
        park.drive(new Boxster());

        System.out.println(new Sonata());

        System.out.println("=============================");
        Car myCar = park.buyCar("소나타");
        myCar.run();

        park.buyCar("박스터").run();

        System.out.println("=======================");

        Sonata 내소나타 = (Sonata)park.buyCar("소나타");
        내소나타.국산세단할인();
        내소나타.run();

        cars[0] = 내소나타;

        System.out.println("========================");

        Boxster 내박스터 = (Boxster) park.buyCar("박스터");
        내박스터.스포츠카할증();


        System.out.println("=========================");

        CarShop shop = new CarShop();
        int money = shop.sellCar(t);
        System.out.println("money = " + money);

    }
}
