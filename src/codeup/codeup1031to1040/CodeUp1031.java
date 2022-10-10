package codeup.codeup1031to1040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String octNum = Integer.toOctalString(Integer.parseInt(br.readLine()));

        System.out.printf("%s", octNum);
    }
}