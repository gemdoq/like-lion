package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("0");
        } else if (n == 0) {
            System.out.println("1");
        }
    }
}