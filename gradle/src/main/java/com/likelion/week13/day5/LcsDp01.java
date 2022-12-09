package com.likelion.week13.day5;

public class LcsDp01 {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; // 열
        String str2 = "DCABDC"; // 행

        // str2인 DCABDC를 i로 놓고 바깥쪽에서 반복할 예정 //행
        // str1인 ABCDCBA를 j로 놓고 안쪽에서 반복할 예정 //열

//        str2.length() * str1.length()
        int[][] dp = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("i:%s j:%s\n", str2.charAt(i), str1.charAt(j));
            }
        }
    }
}