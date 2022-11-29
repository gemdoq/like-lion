package com.likelion.week12.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RadixSort05 {
    public static void main(String[] args) {
        int[] array = {2, 8, 18, 13005, 1, 7, 16, 7, 0, 14};
        int[] result = RadixSort05.sort(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] array) {
        Set<Integer> digits = new HashSet<>(); // Set에 넣으면 중복 제거가 됨
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                digits.add(1); // 0은 로그로 자리수를 구할 수 없음
            } else {
                int digit = (int) (Math.log10(array[i]) + 1);
                digits.add(digit);
            }
        }

        // Set에 넣었던 숫자들을 Array로
        int[] answer = new int[digits.size()];
        int idx = 0;
        for (Integer digit : digits) {
            answer[idx++] = digit;
        }

        // Set은 순서를 보장하지 않기 때문에 return하기 전에 정렬
        Arrays.sort(answer);
        return answer;
    }
}