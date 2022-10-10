package codeup.codeup1031to1040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hexNum = Integer.toHexString(Integer.parseInt(br.readLine()));

        System.out.println(hexNum);
        br.close();
    }
}