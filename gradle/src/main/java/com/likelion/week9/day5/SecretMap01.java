package com.likelion.week9.day5;

import java.util.Arrays;

public class SecretMap01 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        /*
        배열의 각 요소를 2진법으로 변환
        변환한 요소를 각각 배열로 변환해서 자릿수별로 자르기
        자른 arr1의 배열요소와 같은 index의 arr2의 배열요소를 비교
        둘 중 하나라도 1이 있을 경우 True고 아닐 경우 False
        그 결과값을 true면 #으로, false면 공백으로 전환해서 연결
        각 index를 돌며 배열에 담기
         */
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        SecretMap01 secretMap01 = new SecretMap01();
        String[] result = secretMap01.solution(n, arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}