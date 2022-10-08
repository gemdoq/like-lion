package codeup.codeup1011to1020;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] idNum = sc.nextLine().split("\\-");

        int frontNum = Integer.parseInt(idNum[0]);
        int endNum = Integer.parseInt(idNum[1]);

        System.out.printf("%06d%07d", frontNum, endNum);
    }
}