package com.likelion.week9.day3;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class SelectionSort03 {
    public void sortUsingBiPredicate(int[] arr, BiPredicate<Integer, Integer> biPredicate) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int targetIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (biPredicate.test(arr[targetIdx], arr[j])) {
                    targetIdx = j;
                }
            }
            if (targetIdx != i) {
                int temp = arr[i];
                arr[i] = arr[targetIdx];
                arr[targetIdx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,9,10,223,111,23,3,39};
        SelectionSort03 selectionSort03 = new SelectionSort03();

        selectionSort03.sortUsingBiPredicate(arr, (a,b)->a>b);
        System.out.println(Arrays.toString(arr));
        selectionSort03.sortUsingBiPredicate(arr, (a,b)->a<b);
        System.out.println(Arrays.toString(arr));
    }
}