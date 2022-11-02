package com.likelion.week8.day3;

public class Eratosthenes02 {
    public boolean[] solution(int maxNum) {
        int N = maxNum;
        int[] nums = new int[N];
        boolean[] checks = new boolean[N];

        boolean[] answer = new boolean[maxNum];

        for(int i = 2; i <= N; i++) {
            nums[i-2] = i;
        }
        for(int j = 2; j <= N; j++) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] % j == 0 && nums[i] > j) checks[i] = false;
            }
        }
        answer = checks;

        return answer;
    }

    public static void main(String[] args) {
        Eratosthenes02 eratosthenes02 = new Eratosthenes02();
        boolean[] result = eratosthenes02.solution(50);

        for (boolean check:result) {
            System.out.printf("%s ", check);
        }
    }
}