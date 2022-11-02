package com.likelion.week8.day3;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes01 {

    public static void main(String[] args) {
        int N = 50;
        List<Integer> primeNumberList = new ArrayList<>();
        // 2~50 채우기
        for (int i = 2; i <= N; i++) primeNumberList.add(i);
        // 2의 배수 지우기 ( removeIf()도 같은 역할 )
        for (int i = 0; i < primeNumberList.size(); i++) {
            if (primeNumberList.get(i) % 2 == 0 && primeNumberList.get(i) > 2) primeNumberList.remove(i);
        }
        System.out.println(primeNumberList);
        System.out.println(primeNumberList.size());
    }
}
