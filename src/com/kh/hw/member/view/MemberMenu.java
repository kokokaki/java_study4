package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

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
            System.out.printf("\n# 최대 등록 가능한 회원 수는 %d명입니다.\n", SIZE);
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
                    if (regCount < SIZE) {
                        insertMember();
                    } else {
                        System.out.println("# 사용자를 추가할 수 없습니다.");
                    }
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    printAll();
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

        char gender = checkGender();
        int age = checkAge();

        mc.insertMember(id, name, pw, email, gender, age);
    }

    //2번 입력메뉴
    private void searchMember() {

        while (true) {
            System.out.println("\n# 검색을 시작합니다.");
            System.out.println("=========================");
            System.out.println("# 1. 아이디로 검색");
            System.out.println("# 2. 이름으로 검색");
            System.out.println("# 3. 이메일로 검색");
            System.out.println("# 9. 메인으로 돌아가기");
            System.out.print("# 메뉴 입력: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    searchById();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchByEmail();
                    break;
                case 9:
                    System.out.println("# 메인 메뉴로 돌아갑니다.");
                    return;
            }
       }
    }




    //2-1번 입력메뉴
    private void searchById() {
        String inputId = inputSearchData("ID");

        Member member = mc.searchId(inputId);

        if (member != null) {
            System.out.println("\n********* 조회 결과 **********");
            System.out.println(member.inform());
        } else {
            System.out.printf("# %s님은 등록된 회원이 아닙니다.\n", inputId);
        }
    }
    //2-2번 입력메뉴
    private void searchByName() {
        String inputName = inputSearchData("이름");

        Member[] members = mc.searchName(inputName);
        if (members.length > 0) {
            System.out.println("****************** 조회 결과 ********************");
            for (Member m : members) {
                System.out.println(m.inform());
            }
        } else {
            System.out.printf("# %s님은 존재하지 않습니다.\n", inputName);
        }
    }
    //2-3번 입력메뉴
    private void searchByEmail() {
        String inputEmail = inputSearchData("이메일");
        Member member = mc.searchEmail(inputEmail);

        if (member != null) {
            System.out.println("\n********* 조회 결과 **********");
            System.out.println(member.inform());
        } else {
            System.out.printf("# %s: 등록된 이메일이 아닙니다.\n", inputEmail);
        }
    }

    private String inputSearchData(String kind) {
        System.out.println("##############################");
        System.out.printf("# 검색할 회원의 %s: ", kind);
        return sc.next();
    }

    private int checkAge() {
        int age = 0;
        while (true) {
            System.out.print("- 나이: ");
            age = sc.nextInt();
            if (age > 0 && age <= 100) {
                break;
            } else {
                System.out.println("나이 범위가 올바르지 않습니다.");
            }
        }
        return age;
    }

    //4번 메뉴
    private void deleteMember() {
        while (true) {
            System.out.println("\n# 회원 정보 삭제");
            System.out.println("# 1. 특정 회원 삭제");
            System.out.println("# 2. 전체 회원 삭제");
            System.out.println("# 9. 메인으로 돌아가기");
            System.out.print("- 메뉴 입력: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    deleteOne();
                    break;
                case 2:
                    deleteAll();
                case 9:
                    System.out.println("# 메인으로 돌아갑니다.");
                    return;
            }
        }

    }

    //4-1번 메뉴
    private void deleteOne() {
        System.out.print("\n# 삭제할 회원의 ID: ");
        String delId = sc.next();

        Member member = mc.searchId(delId);
        String name = "";
        if (member != null) {
            name = member.getName();
        }
        boolean delFlag = mc.delete(delId);
        if (delFlag) {
            System.out.printf("# %s님의 정보삭제가 완료되었습니다.\n", name);
        } else {
            System.out.printf("# %s님은 존재하지 않습니다.\n", delId);
        }
    }
    //4-2번 메뉴
    private void deleteAll() {
        System.out.println("\n# 전체 회원을 삭제합니다. [y/n]");
        String check = sc.next();
        switch (check) {
            case "Y": case "y": case "ㅛ":
                mc.delete();
                break;
            case "N": case "n": case "ㅜ":
                System.out.println("# 삭제를 취소합니다.");
        }
    }

    //5번 입력메뉴 : 전체 출력
    private void printAll() {
        Member[] members = mc.printAll();
        int count = mc.existMemberNum();

        if (count <= 0) {
            System.out.println("\n# 아직 한명도 등록되지 않았습니다. 회원 등록을 먼저 수행하세요!");
        } else {
            System.out.println("===================== 전체 회원 정보 =======================");

            for (Member m : members) {
                if (m == null) break;
                System.out.println(m.inform());
            }
        }
    }

    //성별값을 검증하는 메서드
    private char checkGender() {
        char gender = 0;
        while (true) {
            System.out.print("- 성별(M/F): ");
            gender = sc.next().toLowerCase().charAt(0);
            if (gender == 'm' || gender == 'f') {
                return gender;
            } else {
                System.out.println("\n# 성별을 다시 입력하세요!");
            }
        }
    }
}
