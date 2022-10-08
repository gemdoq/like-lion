package codeup.codeup1021to1030;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = sc.nextLine().split("");
        for(String s : word) {
            System.out.printf("\'%s\'\n", s);
        }
    }
}