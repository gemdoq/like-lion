package codeup.codeup1021to1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1030 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long lNum = Long.parseLong(br.readLine());
        System.out.printf("%d", lNum);
        br.close();
    }
}