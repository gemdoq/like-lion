package codeup.codeup1011to1020;

import java.util.Scanner;

public class CodeUp1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(":");

        System.out.printf("%s:%s", time[0], time[1]);
    }
}