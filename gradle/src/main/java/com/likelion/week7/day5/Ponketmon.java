package com.likelion.week7.day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ponketmon {
    //해쉬맵으로 키와 밸류 쌍 저장
    //키는 포켓몬 종류배열 nums
    //밸류는 포켓몬 갯수 getKey()
    //반복문을 돌려서 nums에서 set에 키를 저장하면서 밸류는 1씩 증가
    //이터레이터로 만들어서 가장 큰 밸류를 가진 값을 answer에 할당
    //answer반환
    public int solution(int[] nums) {
        int answer = 0;
        //포켓몬 종류 배열은 key, 포켓몬 갯수는 value
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int ponket:nums) {
            if(hashMap.get(ponket) == null) {
                hashMap.put(ponket, 0);
            } else {
                hashMap.put(ponket, hashMap.get(ponket)+1);
            }
        }

        //포켓몬 종류를 숫자로 변환
        int kind = hashMap.keySet().size();

        if(kind > nums.length/2) {
            answer = nums.length/2;
        } else {
            answer = kind;
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] input = {3,3,3,2,2,4};

        Ponketmon ponketmon = new Ponketmon();
        int answer = ponketmon.solution(input);

        System.out.println(answer);
    }

}
