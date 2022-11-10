package com.likelion.week9.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateTheSameNumber {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        HateTheSameNumber hateTheSameNumber = new HateTheSameNumber();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = hateTheSameNumber.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}