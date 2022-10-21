package com.likelion.week6.day5;

public class SolveBracket01 {
    public boolean solution(String s) {
        System.out.println(s);
        while (s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        } // replaceAll("\\(\\)","")
        return s.length() == 0;
//        System.out.println(s.length());
//        String r1 = s.replace("()",""); // replaceAll("\\(\\)","")
//        System.out.println(r1);
//        System.out.println(s.length());
    }
}