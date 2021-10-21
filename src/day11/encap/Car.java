package day11.encap;

public class Car {

    private String model; //모델명
    private int speed; //현재 속도
    private char mode; //변속 모드 (D, N, R, P)
    private boolean startFlag; //시동 온오프 상태

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    //변속 기능
    //setter: 필드가 private으로 감춰져있을 때 필드값을 변경해주는 메서드
    public void setMode(char mode) {
        switch (mode) {
            case 'D':
            case 'R':
            case 'N':
            case 'P':
                System.out.println("변속이 정상적으로 수행되었습니다.");
                this.mode = mode;
                break;
            default:
                System.out.println("잘못된 변속 설정입니다. P모드로 자동설정합니다.");
                this.mode = 'P';
        }
        System.out.println("현재 모드: " + this.mode);
    }

    //getter: private으로 되어있는 필드값을 참조하기 위한 메서드
    public int getSpeed() {
        return speed;
    }

    //가속 기능
    public void accelerator() {

        if (this.mode != 'D') {
            System.out.println("변속 모드를 D로 설정하세요!");
            return;
        }

        if (this.speed >= 200) {
            this.speed = 100;
            System.out.println("과속은 위험합니다.");
            return;
        }
        this.speed += 50;
        System.out.printf("현재 속도는 %dkm/h입니다.\n", this.speed);
    }

    //감속 기능
    public void slowdown() {
        this.speed -= 30;
        if (this.speed <= 0) {
            this.speed = 0;
        }
        System.out.printf("현재 속도는 %dkm/h입니다.\n", this.speed);
    }

    //시동을 거는 기능
    public void engineStart() throws NullPointerException, IndexOutOfBoundsException {
        System.out.println("시동이 걸립니다.");
        startFlag = true;
        injectGasoline();
        moveCylinder();
    }

    //연료가 분사되는 기능
    private void injectGasoline() throws NullPointerException {
        if (startFlag) {
            System.out.println("연료가 엔진에 주입됩니다.");
        } else {
            System.out.println("시동이 꺼져있어 차가 고장납니다.");
        }
    }

    //실린더가 작동하는 기능
    private void moveCylinder() throws IndexOutOfBoundsException {
        if (startFlag) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("시동이 꺼져서 고장났습니다.");
        }
    }

}
