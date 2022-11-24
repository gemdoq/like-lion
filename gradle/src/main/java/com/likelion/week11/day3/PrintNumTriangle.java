package com.likelion.week11.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PrintNumTriangle.print(n);
    }

    private static void print(int n) {
        if(n <= 0) return;
        print(n - 1);
        System.out.println(num(n));
    }

    private static String num(int n) {
        String num = String.valueOf(n);
        if(n <= 0) return "";
        return num(n-1) + num + " ";
    }
}
