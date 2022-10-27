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


    public String solution2(String[] participant, String[] completion) {
        //포기자 공백
        String answer = "";

        //키와 카운트값을 같이 보관하는 자료구조만들기(키와 값을 같이 보관하기 위해)
        HashMap<String, Integer> map = new HashMap<>();

        //앞 배열의 처음부터 끝까지 돌면서 중복되는 값은 제외하고 1 할당
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        //뒷 배열의 처음부터 끝까지 돌면서 이미 있는 값은 -1
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        //결과를 순서대로 볼 수 있는 자료구조에 담기(순서대로 검색하기 위해)
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        //반복문을 돌려서 카운트값 0이면 포기자로 설정
        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};

        Unfinished unfinished = new Unfinished();
        String result = unfinished.solution2(part, comp);
        //값이 맞게 문자열로 출력되는지 확인
        System.out.println(result);
    }
}
