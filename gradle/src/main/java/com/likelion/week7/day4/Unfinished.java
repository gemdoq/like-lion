package com.likelion.week7.day4;

import java.util.Arrays;

public class Unfinished {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!(participant[i].equals(completion[i]))) {
                answer = participant[i];
                break;
            }
            if (i == completion.length - 1) answer = participant[i + 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};

        Unfinished unfinished = new Unfinished();
        unfinished.solution(part, comp);
    }
}
