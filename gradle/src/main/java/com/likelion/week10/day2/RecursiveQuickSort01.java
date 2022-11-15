package com.likelion.week10.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveQuickSort01 {
    public static void main(String[] args) {
        int[] unsortedArray = {20,18,5,19,5,25,40,50};

        RecursiveQuickSort01 recursiveQuickSort01 = new RecursiveQuickSort01();
        int[] result = recursiveQuickSort01.sort(unsortedArray);

        System.out.println(Arrays.toString(result));
    }

    public int[] sort(int[] unsortedArray) {

        int[] answer = null;
        int index = 0;
        // midIdx
        index = unsortedArray.length/2;
        // pivotValue
        int pivotValue = unsortedArray[index];

        List<Integer> mid = new ArrayList<Integer>();
        List<Integer> under = new ArrayList<Integer>();
        List<Integer> upper = new ArrayList<Integer>();

        mid.add(pivotValue);

        for (int n:unsortedArray) {
            if(n < pivotValue) under.add(n);
            else if (n >= pivotValue) upper.add(n);
        }
        System.out.printf("underPivot : %s\n", under);
        System.out.printf("Pivot : %s\n", mid);
        System.out.printf("upperPivot : %s\n", upper);

        return answer;
    }
}