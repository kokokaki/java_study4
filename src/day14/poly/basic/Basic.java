package day14.poly.basic;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

class Computer {
//    LGMonitor monitor;
    Monitor monitor;
}
class Monitor {}
class LGMonitor extends Monitor {}
class HPMonitor extends Monitor {}


public class Basic {

    Object x1 = new A();
    Object x2 = new B();
    Object x3 = new C();
    Object x4 = new D();
    Object x5 = new E();

    public static void main(String[] args) {

        Computer com = new Computer();
        com.monitor = new LGMonitor();
        com.monitor = new HPMonitor();

        double[] dArr = {
                5.5, 3.3, 15
        };

        Monitor[] hpMonitors = {
                new HPMonitor()
                , new LGMonitor()
        };

        Object[] arr = {5, 3.14, "hello", new LGMonitor()};


    }
}
