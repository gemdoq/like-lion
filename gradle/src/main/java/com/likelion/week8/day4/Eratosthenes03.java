package com.likelion.week8.day4;

import java.util.Arrays;

public class Eratosthenes03 {
    public int solution(int maxNum) {
        int answer = 0;
        int N = maxNum;

        int[] nums = new int[N - 1]; // N-1개만큼 2~50까지 총 49개

        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성

        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false

        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~49까지 nums에 채우기

        for (int j = 0; j * j <= N; j++) {// N == 49
            int multipleOf = nums[j]; // j=0 nums[0] = 2
            // 초항이 2 2n인 2 4 6 8 10
            for (int i = nums[j] + j; i < nums.length; i += multipleOf) {
                checks[i] = false;
            }
//            printNums(nums, checks);
        }

        for (int i = 0; i < checks.length; i++) {
            if (checks[i]) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Eratosthenes03 eratosthenes03 = new Eratosthenes03();
        int result = eratosthenes03.solution(50);

        System.out.printf("%d ", result);
    }
}