package com.likelion.week10.day5;

public class CaesarCipher01 {

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('A' <= ch && 'Z' >= ch) {
                ch += n;
                if (ch > 'Z') ch = (char) (ch % 'Z' + 64);
            } else if ('a' <= ch && 'z' >= ch) {
                ch += n;
                if (ch > 'z') ch = (char) (ch % 'z' + 96);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        CaesarCipher01 caesarCipher01 = new CaesarCipher01();

        String case1 = "ABC";
        String case2 = "A B C";
        String case3 = "a G z";
        String case4 = "A   h  Z b";
        String case5 = "a b c d Z";

        System.out.println(caesarCipher01.solution(case1, 1));
        System.out.println(caesarCipher01.solution(case1, 3));
        System.out.println(caesarCipher01.solution(case2, 1));
        System.out.println(caesarCipher01.solution(case2, 5));
        System.out.println(caesarCipher01.solution(case3, 3));
        System.out.println(caesarCipher01.solution(case4, 3));
        System.out.println(caesarCipher01.solution(case5, 25));
    }

}