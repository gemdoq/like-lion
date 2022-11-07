package com.likelion.week9.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisiveArray01 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        // ArrayList를 만든다
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // 나머지가 0이면 arrayList에 담는다
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) arrayList.add(arr[i]);
        }
        // arrayList가 비어있으면 -1을 담는다
        if(arrayList.isEmpty()) {
            arrayList.add(-1);
        }
        // answer에 arrayList크기만큼 배열을 만든다
        answer = new int[arrayList.size()];
        // answer에 arrayList 배열 요소를 하나씩 담는다
        for(int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        // answer를 정렬한다
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,9,7,10};
        int divisor = 5;

        DivisiveArray01 divisiveArray01 = new DivisiveArray01();
        System.out.println(Arrays.toString(divisiveArray01.solution(arr, divisor)));
    }
}