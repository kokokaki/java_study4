package day06;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int[][] scores = {
            {80, 90, 85, 95},
            {90, 60, 75, 85},
            {95, 90, 85, 55}
        };
        System.out.println("scores.length = " + scores.length);
        System.out.println(scores[0][1]);
        System.out.println(Arrays.toString(scores[1]));
        System.out.println(scores[2]);

        scores[2][1] = 40;
        scores[0] = new int[] {100, 100, 100, 100};

        System.out.println("========================");
        for (int[] arr : scores) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println(); //단순 줄개행
        }

        //배열 생성문으로 2차원 배열 만들기
        //3행 5열짜리 배열
        System.out.println("=====================");

        int[][] testArr = new int[3][5];

        for (int[] ints : testArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        int[][][] arr3d = {
            { {1,1,1},{2,2,7},{3,3,3} },
            { {4,4,4},{3,3,3},{2,2,2} },
            { {1,1,1},{2,2,2},{5,5,5} }
        };
        System.out.println(arr3d[0][1][2]);

        for (int[][] ints : arr3d) {
            for (int[] anInt : ints) {
                for (int i : anInt) {

                }
            }
        }
    }
}
