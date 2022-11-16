package com.likelion.week10.day3;

import java.util.Arrays;

public class RecursiveQuickSort02 {
    public static void main(String[] args) {
        int[] unsortedArray = {20,18,5,19,5,25,40,50};
        RecursiveQuickSort02 recursiveQuickSort02 = new RecursiveQuickSort02();

        int[] sortedArray = recursiveQuickSort02.sort(unsortedArray);

        String answer = Arrays.toString(sortedArray);
        // Print
        System.out.printf("받은 리스트를 정렬하면 : %s\n", answer);
    }

    public int[] sort(int[] unsortedArray) {

        System.out.printf("현재 주어진 배열 상태 : %s\n", Arrays.toString(unsortedArray));

        // pivotValue
        int pivotIndex = unsortedArray.length/2;
        int pivotValue = unsortedArray[pivotIndex];
        System.out.println(pivotValue);
        // leftIndex
        int leftIndex = 0;
        while( leftIndex < pivotValue) leftIndex += 1;
        System.out.println(leftIndex);
        // rightIndex
        int rightIndex = unsortedArray.length - 1;
        while( rightIndex > pivotValue) rightIndex -= 1;
        System.out.println(rightIndex);
        // swap
        swap(unsortedArray, leftIndex, rightIndex);

        System.out.printf("4:%d 7:%d\n", unsortedArray[4], unsortedArray[7]);
        System.out.printf("현재 주어진 배열 상태 : %s\n", Arrays.toString(unsortedArray));
//        int[] lowerList = new int[];
//        int[] higherList = new int[];
//
//        System.out.printf("현재 Pivot : %d\n", pivotValue);
//        System.out.printf("현재 Pivot이하 배열은 : %s\n", Arrays.toString(lowerList));
//        System.out.printf("현재 Pivot이상 배열은 : %s\n", Arrays.toString(higherList));

        int[] answer = new int[unsortedArray.length];
        return answer;
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}