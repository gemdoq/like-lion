package com.likelion.week12.day2;

import java.util.*;

public class RadixSort06 {
    public static void main(String[] args) {
        int[] array = {2, 8, 18, 13005, 1, 7, 16, 7, 0, 14};
        int[] result = RadixSort06.sort(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] array) {
        // Queue 10개 생성
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        //자릿수에 맞게 queue에 넣기 1, 10, 100 ...
        for (int i = 0; i < array.length; i++) {
            int digit = (int) Math.pow(10, 0);
            queueArr[Math.floorDiv(array[i], digit) % 10].add(array[i]);
        }

        return new int[10];
    }
}