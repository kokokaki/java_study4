package com.kh.practice.student.run;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        StudentController ss = new StudentController();

        System.out.println(ss.sArr[3].inform());
    }
}
