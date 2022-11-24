package com.likelion.week11.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PrintStar02.print(n);
    }

    private static void print(int n) {
        if(n <= 0) return;
        print(n - 1);
        System.out.println(star(n));
    }

    private static String star(int n) {
        if(n <= 0) return "";
        return "*"+star(n-1);
    }
}
