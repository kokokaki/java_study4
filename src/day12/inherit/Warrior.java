package day12.inherit;

public class Warrior extends Player {

    public int rage;

    public Warrior() {
        this("dd");
        System.out.println("Warrior 객체 생성됨!");
    }

    public Warrior(String name) {
        super(name);
        this.rage = 100;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 분노: " + rage);
    }

    public void fireSlash() {

    }
}
