package com.likelion.week12.day2;

import java.util.Arrays;

public class RadixSort01 {
    public static void main(String[] args) {

        int[] array = {7,4,5,9,1,0};

        int[] result = RadixSort01.sort(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] array) {

        int[] answer = new int[10];

        Arrays.fill(answer, -1);

        System.out.println(Arrays.toString(answer));

        for (int i:array) {
            answer[i] = i;
        }

        System.out.println(Arrays.toString(answer));

        int cnt = 0;
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] != -1) {
                array[cnt++] = answer[i];
            }
        }
        System.out.println(Arrays.toString(array));

        return array;
    }
}