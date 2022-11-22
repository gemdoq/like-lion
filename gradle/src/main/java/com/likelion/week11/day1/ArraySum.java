package com.likelion.week11.day1;

public class ArraySum {
    static int sum(int[] arr, int index) {
        if(arr.length == index) return 0;
        // idx + 1을 해서 탈출조건이 성립되게끔 만든다.
        return arr[index] + sum(arr,index+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,3,2,9};
        int r = sum(arr,0);
        // 처음 호출할 때도 0을 추가로 넣어주어서 복잡해졌다.
        // 파라미터를 하나 더 추가해서 더 복잡해졌다.
        System.out.println(r);
    }
}