package com.likelion.week10.day4;

import java.util.Arrays;

public class RecursiveQuickSort02 {
    public static void main(String[] args) {
        int[] unsortedArray = {20,18,5,19,5,25,40,50};
        RecursiveQuickSort02 recursiveQuickSort02 = new RecursiveQuickSort02();
        System.out.printf("원     래       배     열 : %s\n", Arrays.toString(unsortedArray));

        int[] sortedArray = recursiveQuickSort02.sort(unsortedArray);

        String answer = Arrays.toString(sortedArray);
        // Print
        System.out.printf("받은 리스트를 정렬하면 : %s\n", answer);
    }

    public int[] sort(int[] unsortedArray) {
         System.out.printf("현재 주어진 배열 상태 : %s\n", Arrays.toString(unsortedArray));

        // pivotValue
        int pivotIndex = unsortedArray.length / 2;
        int pivotValue = unsortedArray[pivotIndex];

        // leftIndex
        int leftIndex = 0;
        while (leftIndex < pivotValue) leftIndex += 1;

        // rightIndex
        int rightIndex = unsortedArray.length - 1;
        while (rightIndex > pivotValue) rightIndex -= 1;

        while (leftIndex <= rightIndex) {
            while (unsortedArray[leftIndex] < pivotValue) leftIndex++;
            while (unsortedArray[rightIndex] > pivotValue) rightIndex--;
            if (leftIndex <= rightIndex) {
                swap(unsortedArray, leftIndex, rightIndex);
                leftIndex += 1;
                rightIndex -= 1;
            }
        }
        return unsortedArray;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}