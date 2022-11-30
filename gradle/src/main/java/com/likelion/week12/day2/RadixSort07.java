package com.likelion.week12.day2;

import java.util.*;

public class RadixSort07 {
    public static int[] getDigits(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // 중복제거 하여 자릿수 구하기
            if (arr[i] == 0) set.add(1);
            else set.add((int)(Math.log10(arr[i])+1));
        }

        // 중복 제거된 자릿수를 arr에 담기
        int[] answer = new int[set.size()];
        int idx = 0;
        for (Integer num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer); //정렬
        return answer;
    }

    public static int[] sort(int[] arr, int digit) {
        // Queue 10개 생성
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        //자릿수에 맞게 queue에 넣기 1, 10, 100 ...
        for (int i = 0; i < arr.length ; i++) {
            int divisor = (int) Math.pow(10, digit - 1); // 10의 0제곱이므로 1의자리
            queueArr[Math.floorDiv(arr[i], divisor) % 10].add(arr[i]);
        }

        // queue에서 꺼내서 arr로 만들기
        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) { // queueArr을 반복 합니다.
            while(!queueArr[i].isEmpty()){
                arr[idx++] = queueArr[i].poll();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // 10개 queue생성
        int[] arr = new int[]{7, 4, 5, 9, 1, 0, 20};
        int[] digits = getDigits(arr);

        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(arr));
        for (var digit : digits) {
            arr = sort(arr, digit);
            System.out.println(Arrays.toString(arr));
        }
    }
}