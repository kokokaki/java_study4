package day10.player;

public class Player {

    String name;
    int level;
    int hp;

    public Player() {
        this("이름없음");
        System.out.println("1번 생성자!");
    }

    public Player(String name) {
        this(name, 1);
        System.out.println("2번 생성자!");
    }

    public Player(String name, int level) {
        System.out.println("3번 생성자!");
        this.name = name;
        this.level = level;
        this.hp = 50 + this.level * 5;
    }

    public void attack(Player target) {
        System.out.printf("%s님이 %s님을 공격합니다.\n"
                        , this.name, target.name);

        target.hp -= 10;

        //System.out.println("this = " + this);
        //System.out.println("target = " + target);
    }

    public void info() {
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n"
                        , this.name, this.level, this.hp);
    }

}
