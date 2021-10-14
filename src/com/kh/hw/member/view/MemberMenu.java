package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;

import java.util.Locale;
import java.util.Scanner;

import static com.kh.hw.member.controller.MemberController.SIZE;

public class MemberMenu {

    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    public MemberMenu() {
    }

    //메인메뉴 출력 메서드
    public void mainMenu() {

        while (true) {
            System.out.printf("# 최대 등록 가능한 회원 수는 %d명입니다.\n", SIZE);
            int regCount = mc.existMemberNum();
            System.out.printf("# 현재 등록된 회원 수는 %d명입니다.\n", regCount);

            System.out.println("==================================");

            if (regCount < SIZE) {
                System.out.println("# 1. 새 회원 등록");
            }
            System.out.println("# 2. 회원 검색");
            System.out.println("# 3. 회원 정보 수정");
            System.out.println("# 4. 회원 삭제");
            System.out.println("# 5. 모두 출력");
            System.out.println("# 9. 끝내기");
            System.out.print("\n # 메뉴 번호 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); //프로그램 정상 종료 메서드
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    //1번 입력메뉴
    private void insertMember() {
        System.out.println("\n# 새 회원을 등록합니다.");

        String id = null;
        while (true) {
            System.out.print("- 아이디: ");
            id = sc.next();

            if (mc.checkId(id)) {
                System.out.println("# 중복된 아이디입니다. 다시 입력하세요.");
            } else {
                break;
            }
        }

        System.out.print("- 이름: ");
        String name = sc.next();
        System.out.print("- 비밀번호: ");
        String pw = sc.next();
        System.out.print("- 이메일: ");
        String email = sc.next();

        char gender = 0;
        while (true) {
            System.out.print("- 성별(M/F): ");
            gender = sc.next().toLowerCase().charAt(0);
            if (gender == 'm' || gender == 'f') {
                break;
            } else {
                System.out.println("\n# 성별을 다시 입력하세요!");
            }
        }

        System.out.print("- 나이: ");
        int age = sc.nextInt();

        mc.insertMember(id, name, pw, email, gender, age);
    }
}
