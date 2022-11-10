package com.likelion.week9.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateTheSameNumber {
    public int[] solution(int[] arr) {
        int[] answer = {};
        //배열의 길이가 얼마나 늘어날지 모르므로 가변 자료구조인 list 선언
        List<Integer> list = new ArrayList<Integer>();

        //처음 요소는 무조건 삽입
        list.add(arr[0]);

        //처음 이후의 요소부터 모든 요소를 순회하면서 앞의 요소와 비교해서 다를 경우(=연속되는 값이 중복되지 않을 경우)
        //list에 삽입하는 반복문
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        //list를 이제 다시 array로 변환하기 위해 담긴 요소의 갯수만큼의 사이즈 배열을 할당
        answer = new int[list.size()];
        //list의 요소를 answer 배열에 삽입하는 순회반복문
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