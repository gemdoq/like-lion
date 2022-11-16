package com.likelion.week10.day3;

import java.util.Arrays;

public class QuickSort01 {
    public static void main(String[] args) {
        int[] unsortedArray = {20,18,5,19,5,25,40,50};
        QuickSort01 quickSort01 = new QuickSort01();

        int[] sortedArray = quickSort01.sort(unsortedArray);

        String answer = Arrays.toString(sortedArray);
        // Print
        System.out.printf("받은 리스트를 정렬하면 : %s\n", answer);
    }

    public int[] sort(int[] unsortedArray) {

        int index = unsortedArray.length/2;
        int pivotValue = unsortedArray[index];

        int[] lowerList = new int[];
        int[] higherList = new int[];

        System.out.printf("현재 Pivot : %d\n", pivotValue);
        System.out.printf("현재 Pivot이하 배열은 : %s\n", Arrays.toString(lowerList));
        System.out.printf("현재 Pivot이상 배열은 : %s\n", Arrays.toString(higherList));

        int[] answer = new int[];
        return answer;
    }
}