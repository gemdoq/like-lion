package com.likelion.week6.day5;

public class SolveBracket02 {
    public boolean solution(String s) {
        System.out.println(s);
        while (s.indexOf("()") >= 0) {
            String[] splitted = s.split("\\(\\)");
            s = String.join("",splitted);
        } // replaceAll("\\(\\)","")
        return s.length() == 0;
    }
}
