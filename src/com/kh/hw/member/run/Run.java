package com.kh.hw.member.run;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Run {

    public static void main(String[] args) {
        MemberController mc = new MemberController();

        Member[] members = mc.searchName("김철수");
        for (Member member : members) {
            String inform = member.inform();
            System.out.println(inform);
        }
    }
}
