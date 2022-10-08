package codeup.codeup1021to1030;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Num = sc.nextLine().split("\\.");
        int frontNum = Integer.parseInt(Num[0]);
        int endNum = Integer.parseInt(Num[1]);
        System.out.printf("%d\n%d", frontNum, endNum);
    }
}