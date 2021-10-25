package day18.generic;

//제네릭: 설계당시에는 필드의 타입을 지정하지 않음
//       객체생성시 타입이 결정되며 해당타입이 고정됨.
public class Basket<F extends Fruit> {

    private F f;

    public void setF(F f) {
        this.f = f;
    }

    public F getF() {
        return f;
    }
}
