package day05;

import java.util.Arrays;

public class ArrayDelete {

    public static void main(String[] args) {

        //배열의 중간 데이터 삭제
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제전: " + Arrays.toString(arr));

        int delIdx = 2;

        for (int i = delIdx; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        int[] temp = new int[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;

        System.out.println("삭제후: " + Arrays.toString(arr));

    }
}
