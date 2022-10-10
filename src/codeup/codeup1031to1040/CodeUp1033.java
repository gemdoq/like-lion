package codeup.codeup1031to1040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String upHexNum = Integer.toHexString(Integer.parseInt(br.readLine())).toUpperCase();

        System.out.println(upHexNum);
        br.close();
    }
}