package day18.generic;

import day10.modi.pac1.A;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();
        System.out.println("apple = " + apple);

        PeachBasket pb = new PeachBasket();
        pb.setPeach(new Peach());

        System.out.println("=====================");

        Basket<Apple> apb = new Basket<>();
        apb.setF(new Apple());
        Apple f = apb.getF();

        Basket<Peach> pcb = new Basket<>();
        pcb.setF(new Peach());
        Peach peach = pcb.getF();

//        Basket<Water> waterBasket = new Basket<>();

    }
}
