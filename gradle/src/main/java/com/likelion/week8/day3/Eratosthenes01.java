package com.likelion.week8.day3;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes01 {
    public List<Integer> solution(int maxNum) {
        List<Integer> answer;

        int N = maxNum;
        List<Integer> primeNumberList = new ArrayList<>();

        for (int i = 2; i <= N; i++) primeNumberList.add(i);

        for (int j = 2; j * j <= N; j++) {
            for (int i = 0; i < primeNumberList.size(); i++) {
                if (primeNumberList.get(i) % j == 0 && primeNumberList.get(i) > j) primeNumberList.remove(i);
            }
        }
        answer = primeNumberList;

        return answer;
    }

    public static void main(String[] args) {
        Eratosthenes01 eratosthenes01 = new Eratosthenes01();
        List<Integer> result = eratosthenes01.solution(10000);

        System.out.println(result);
        System.out.println(result.size());
    }

}