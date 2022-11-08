package com.likelion.week9.day2;

import java.util.Scanner;

public class DataSearch01 {
    /*
    데이터의 개수 n이 입력되고,
    n개의 양의 정수 데이터가 공백으로 분리되어 입력된다.
    찾고자 하는 특정 정수 k가 입력된다.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];

        for(int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        int c = sc.nextInt();
        int index = -1;
        for(int i = 0; i < a; i++) {
            if(b[i] == c) {
                index = i+1;
                break;
            }
        }
        System.out.println(index);
    }
}