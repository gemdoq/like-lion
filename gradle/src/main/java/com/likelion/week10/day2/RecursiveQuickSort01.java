package com.likelion.week10.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveQuickSort01 {
    public static void main(String[] args) {
        int[] unsortedArray = {20,18,5,19,5,25,40,50};
        RecursiveQuickSort01 recursiveQuickSort01 = new RecursiveQuickSort01();
        // make Array to List
        List<Integer> unsortedList = recursiveQuickSort01.toList(unsortedArray);
        System.out.printf("받은 배열을 리스트로 변환하면 : %s\n", unsortedList);
        // Sort List
        List<Integer> result = recursiveQuickSort01.sort(unsortedList);
        // Print
        System.out.printf("받은 리스트를 정렬하면 : %s\n", result);
    }

    public List<Integer> toList(int[] array) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            answer.add(array[i]);
        }
        return answer;
    }

    public List<Integer> sort(List<Integer> unsortedList) {

        if ( unsortedList.size() < 2 ) {
            return unsortedList;
        }

        int pivotValue = unsortedList.get(0);
        List<Integer> lowerList = new ArrayList<Integer>();
        List<Integer> higherList = new ArrayList<Integer>();

        for (int i = 1; i < unsortedList.size(); i++) {
            if ( unsortedList.get(i) < pivotValue ) {
                lowerList.add(unsortedList.get(i));
            } else {
                higherList.add(unsortedList.get(i));
            }
        }

        System.out.printf("현재 Pivot : %d\n", pivotValue);
        System.out.printf("현재 Pivot이하 리스트는 : %s\n", lowerList);
        System.out.printf("현재 Pivot이상 리스트는 : %s\n", higherList);

        List<Integer> sorted = sort(lowerList);

        sorted.add(pivotValue);
        sorted.addAll(sort(higherList));

        return sorted;
    }
}