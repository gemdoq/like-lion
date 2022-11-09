package com.likelion.week9.day3;

import java.util.Arrays;

public class SelectionSort02 {
    public int[] sortUsingInterface(int[] arr, StatementStrategy statementStrategy) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int targetIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (statementStrategy.apply(arr[targetIdx], arr[j])) {
                    targetIdx = j;
                }
            }
            if (targetIdx != i) {
                int temp = arr[i];
                arr[i] = arr[targetIdx];
                arr[targetIdx] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,9,10,223,111,23,3,39};
        SelectionSort02 selectionSort02 = new SelectionSort02();

        selectionSort02.sortUsingInterface(arr, (a,b)-> a<b);
        System.out.println(Arrays.toString(arr));
        selectionSort02.sortUsingInterface(arr, (a,b)-> a>b);
        System.out.println(Arrays.toString(arr));
    }
}