package codeup.codeup1021to1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double dNum = Double.parseDouble(br.readLine());
        System.out.printf("%.11f", dNum);
        br.close();
    }
}
