package com.kh.hw.member.run;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        MemberController mc = new MemberController();

        mc.delete();

        Member[] members = mc.printAll();
        System.out.println(Arrays.toString(members));
    }
}
