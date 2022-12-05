package com.likelion.week13.day1;

import java.util.Arrays;

public class HeapMaker01 {
    public static void main(String[] args) {
        int[] array = {6,5,7,8};
        int[] result = HeapMaker01.sort(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] array) {
        // 힙 구성
        for(int i = 1; i < array.length; i++) {
            int child = i;
            while(child != 0) {
                int root = (child - 1) / 2;
                if( array[root] < array[child] ) {
                    int temp = array[root];
                    array[root] = array[child];
                    array[child] = temp;
                }
                child = root;
            }
        }
        // 크기를 줄여가며 힙 구성
        for(int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            int root = 0;
            int child = 1;
            while (child < i) {
                child = 2 * root + 1;
                // 자식 중에 더 큰 값을 찾기
                if(child < i - 1 && array[child] < array[child + 1]) {
                    child++;
                }
                // 부모보다 자식이 크다면 교환
                if(child < i && array[root] < array[child]) {
                    temp = array[root];
                    array[root] = array[child];
                    array[child] = temp;
                }
                root = child;
            }
        }
        return array;
    }
}