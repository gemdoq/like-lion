package com.likelion.week12.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RadixSort03 {
    public static void main(String[] args) {
        int[] array = {7, 4, 5, 9, 1, 0, 20};
        int[] result = RadixSort03.sort(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            // 중복제거 하여 자릿수 구하기
            if (array[i] == 0) set.add(1);
            else set.add((int)(Math.log10(array[i])+1));
        }

        // 중복 제거된 자릿수를 array에 담기
        int[] answer = new int[set.size()];
        int idx = 0;
        for (Integer num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer); //정렬
        return answer;
    }
}