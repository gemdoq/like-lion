package codeup.codeup1031to1040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        long result = Long.parseLong(arr[0]) + Long.parseLong(arr[1]);
        System.out.printf("%d", result);
    }
}