package day14.poly.car;

public class CarShop {

    public int sellCar(Car car) {
        if (car instanceof Sonata) {
            return 2000;
        } else if (car instanceof Tucson) {
            return 2400;
        } else if (car instanceof Boxster) {
            return 7000;
        } else {
            return 0;
        }
    }
}
