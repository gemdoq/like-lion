package com.likelion.week10.day1;

import java.util.Arrays;

public class Eratosthenes01 {

    public void solution(int number) {
        int[] arr = new int[number-1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i+=2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Eratosthenes01 eratosthenes01 = new Eratosthenes01();
        eratosthenes01.solution(50);
    }
}