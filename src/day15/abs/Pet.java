package day15.abs;

public abstract class Pet {

    private final String name;
    private final String kind;

    public Pet(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    //예방접종을 맞다
    public abstract void inject();
    //사료를 먹다
    public abstract void eat();

    //노는 기능
    public void play() {
        System.out.println("애완동물은 혼자서도 잘놀아요~");
    }

    public final void swim() {
        System.out.println("애완동물은 자유형 헤엄을 좋아해요~");
    }
}
