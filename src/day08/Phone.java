package day08;

//설계도 클래스는 main메서드를 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    //field

    //고유 속성
    String model; //모델명
    String color; //색상
    int price; //가격

    //상태 속성
    int messageCount; //문자메시지 수
    boolean on; //전원이 켜진 여부
    //문자메시지함
    String[] receiveMessages = new String[3];

    //부품 속성(포함 관계: Composition)
    Battery ionBattery;

    //기능: 객체의 행위
    //method : static붙이지 말 것

    //전원을 켜는 기능
    public void powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다.");
    }
    //전원을 끄는 기능
    public void powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다.");
    }

    //핸드폰의 정보를 보여주는 기능
    public void showSpec() {
        if (!on) {
            System.out.println("전원을 먼저 켜세요!");
            return;
        }
        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price + "원");
    }

    //문자메시지를 보내는 기능
    public boolean sendMessage(Phone targetPhone,String message) {
        //상대방 메시지함이 가득차지 않았다면
        //상대방 문자메시지함의 총 저장 수 > 상대방 현재 메시지 수
        if (targetPhone.receiveMessages.length > targetPhone.messageCount) {
            //내가 보낼 메시지를 상대방 핸드폰의 문자메시지함에 저장
            targetPhone.receiveMessages[targetPhone.messageCount++] = message;
            return true;
        } else {
            System.out.println("상대방의 메시지함이 가득 찼습니다.");
            return false;
        }
    }

    //수신 메시지함을 확인하는 기능
    public void checkMessages() {
        if (!on) {
            System.out.println("전원을 먼저 켜세요.");
            return;
        }

        System.out.printf("\n========== [%s]의 메시지함 ============\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
        }
    }

    //생성자
    public Phone() {
        System.out.println("핸드폰 1번 생성자 호출!");
        model = "애니콜";
        color = "쥐색";
        price = 300000;
    }

    //생성자는 여러 개 선언할 수 있음 (오버로딩)
    public Phone(String modelName) {
        System.out.println("핸드폰 2번 생성자 호출!");
        model = modelName;
        color = "스노우 화이트";
        price = 1000000;
    }

    public Phone(String modelName, String colorName) {
        System.out.println("핸드폰 3번 생성자 호출!");
        model = modelName;
        color = colorName;
        price = 1200000;
    }
}
