package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        int sum = numA+numB;
        int sub = numA-numB;
        int mult = numA*numB;
        int sha = (int)numA/numB;
        int rem = numA%numB;
        float divNum = (float)numA/numB;

        System.out.printf("%s\n%s\n%s\n%s\n%s\n%.2f", sum, sub, mult, sha, rem, divNum);
    }
}