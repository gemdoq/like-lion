package com.likelion.week7.day5;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    /*
    폰북의 제일 앞 요소부터 끝 요소까지 반복문을 돌리며 해쉬테이블에 키를 넣는다.
    다시 폰북을 돌면서 해쉬테이블의 값이 접두어라면 false, 아니면 true
     */
    public boolean solution(String[] phoneBook) {
        boolean answer = true;

        Map<String, Integer> hashMap = new HashMap<>();
        //폰북의 모든 요소를 해쉬맵으로
        for(int i = 0; i < phoneBook.length; i++) {
            hashMap.put(phoneBook[i], i);
        }
        //모든 전화번호의 하위문자가 해쉬맵에 있는지 확인
        for(int i = 0; i < phoneBook.length; i++) {
            for(int j = 0; j < phoneBook[i].length(); j++) {
                if(hashMap.containsKey(phoneBook[i].substring(0, j)))
                    answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] input = {"12","123","1235","567","88"};

        Phonebook phonebook = new Phonebook();
        boolean answer = phonebook.solution(input);

        System.out.println(answer);
    }

}
