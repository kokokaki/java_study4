package day09;

import day08.Phone;

public class MessageMain {

    public static void main(String[] args) {

        Phone haptic = new Phone("햅틱2");
        Phone chocolate = new Phone("초콜릿폰");

        haptic.powerOn();
        haptic.sendMessage(chocolate, "앙영하긔~");
        haptic.sendMessage(chocolate, "똥폰은 못말려~");
        haptic.sendMessage(chocolate, "언제적폰이니~");
        haptic.sendMessage(chocolate, "메롱~~~");

        chocolate.sendMessage(haptic, "답장합니다~~ 즐!");

        chocolate.checkMessages();
        haptic.checkMessages();

        chocolate.showSpec();

        System.out.println("=============================");

        Person park = new Person("박뽀삐", haptic);
        Person kim = new Person("김뽀로로", new Phone("아이폰14"));

        kim.contact(park, "햅틱 좋냐?");
        park.check();

    }
}
