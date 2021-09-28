package day04;

import java.util.Arrays;

public class ArrayPush {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        int newData = 40;

        //1. 원본배열보다 사이즈가 1개 더 큰 새 배열 생성
        int[] temp = new int[arr.length + 1];
        
        //2. 원본배열 데이터를 값복사하여 신규배열로 이동
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        //3. 새로운 데이터를 신규배열의 맨 끝에 추가
        temp[temp.length-1] = newData;
        //4. 주소값 이전
        arr = temp; temp = null;

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));

        //빈배열 만들기
//        String[] sArr = {};
        String[] sArr = new String[0];

    }

}