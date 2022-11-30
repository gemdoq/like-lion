package com.likelion.week12.day3;

public class CharCompare01 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.printf("%b%n", CharCompare01.solution(s));
    }

    private static boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;

        char c = ' ';

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c == 'p' || c== 'P') pCnt++;
            if (c == 'y' || c == 'Y') yCnt++;
        }
        if(pCnt != yCnt) answer = false;
        return answer;
    }
}