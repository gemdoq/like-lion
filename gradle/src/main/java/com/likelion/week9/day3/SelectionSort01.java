package com.likelion.week9.day3;

import java.util.Arrays;

public class SelectionSort01 {
    public int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public int[] reverseSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            if (max != i) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,9,10,223,111,23,3,39};
        SelectionSort01 selectionSort01 = new SelectionSort01();

        selectionSort01.sort(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort01.reverseSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}