package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

import java.util.Arrays;

public class MemberController {

    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;

    public MemberController() {
        m[0] = new Member("abc", "김철수", "1234", "abc@gmail.com", 'm', 24);
        m[1] = new Member("def", "박영희", "4312", "def@gmail.com", 'f', 43);
        m[2] = new Member("ghi", "김철수", "6655", "ghi@gmail.com", 'm', 52);
    }

    /**
     * 실제로 배열에 저장된 회원객체의 숫자를 세는 메서드
     * @return count - 실제 회원의 저장 숫자
     */
    public int existMemberNum() {
        int count = 0; //숫자를 세는 변수
        for (Member member : m) {
            if (member == null) break;
            count++;
        }
        return count;
    }

    /**
     * 아이디 중복을 확인하는 메서드
     * @param inputId - 중복을 확인할 사용자의 입력 아이디
     * @return 중복이 되었으면 true, 안되었으면 false
     */
    public boolean checkId(String inputId) {
        for (Member member : m) {
            if (member == null) break;
            if (inputId.equals(member.getId())) {
                return true; //중복됨
            }
        }
        return false; //중복안됨
    }
    //회원정보를 배열에 저장하는 메서드
    public void insertMember(String id, String name,
                             String password, String email,
                             char gender, int age) {
        int count = existMemberNum();
        m[count] = new Member(id, name, password, email, gender, age);
    }

    //아이디를 입력하면 해당 회원의 정보를 반환
    public Member searchId(String id) {
        for (Member member : m) {
            if (member == null) break;
            if (id.equals(member.getId())) {
                return member;
            }
        }
        return null;
    }

    //이름을 입력하면 그 이름에 해당하는 모든 회원정보 리턴
    public Member[] searchName(String name) {

        //이름이 매칭된 회원들을 저장할 배열
        Member[] foundMembers = {};
        for (Member member : m) {
            if (member == null) break;
            if (name.equals(member.getName())) {
                foundMembers = pushMember(foundMembers, member);
            }
        }
        return foundMembers;
    }

    //멤버배열 맨 끝에 데이터를 추가하는 메서드
    private Member[] pushMember(Member[] targets, Member newMember) {
        Member[] newArr = new Member[targets.length + 1];
        for (int i = 0; i < targets.length; i++) {
            newArr[i] = targets[i];
        }
        newArr[targets.length] = newMember;
        return newArr;
    }

}
