package day12.inherit;

public class Mage extends Player {

    public int mana;

    public Mage() {
        super();
    }

    public Mage(String name) {
        super(name);
        this.mana = 60;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    public void fireball() {

    }
}
