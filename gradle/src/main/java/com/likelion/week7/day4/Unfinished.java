package com.likelion.week7.day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Unfinished {
    public String solution(String[] participant, String[] completion) {
        //포기자는 일단 공백
        String answer = "";

        //두 배열에 순서대로 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        //뒷 배열에 앞 배열의 각 요소가 있는지 탐색
        for (int i = 0; i < completion.length; i++) {
            if (!(participant[i].equals(completion[i]))) {
                answer = participant[i];
                break;
            }
            //없으면 앞 배열의 다음 수가 포기자
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
