package codeup.codeup1021to1030;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(":");

        int min = Integer.parseInt(time[1]);
        System.out.println(min);
    }
}