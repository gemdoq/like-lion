package com.likelion.week12.day2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class RadixSort02 {
    public static void main(String[] args) {
        int[] array = {2,8,18,13,1,7,16,7,0,14};
        int[] result = RadixSort02.sort(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] array) {
        Queue<Integer>[] queueArr = new Queue[10];

        for(int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        for (int i:array) {
            queueArr[i%10].add(i);
        }

        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while (!queueArr[i].isEmpty()) {
                array[idx++] = queueArr[i].poll();
            }
        }
        return array;
    }
}