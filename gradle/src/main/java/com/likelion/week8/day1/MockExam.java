package com.likelion.week8.day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 수포자들 반복패턴을 추출
반복패턴이 정답과 일치하면 점수를 합산할 카운트배열 3칸 생성
정답의 첫 요소부터 마지막 요소까지 돌면서 수포자들의 답안에 있는지 확인해서 있으면 해당하는 수포자의 카운트를 증가
최댓값을 구하고, 최대값과 같으면 리스트에 넣는다.
리스트의 요소의 숫자만큼의 배열을 만든다.
만든 배열에 리스트의 첫 요소부터 마지막 요소까지 돌면서 담는다.
 */
public class MockExam {
    public int[] solution(int[] answers) {
        // 수포자들의 답안
        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};

        // 수포자들 성적표(수포자1, 수포자2, 수포자3)
        int[] scoreCnt = new int[3];

        // 답안지의 요소를 순회탐색해서 정답자 답안과 일치하면 성적증가
        for(int i =0; i < answers.length; i++) {
            if(answers[i] == supoja1[i%5]) scoreCnt[0]++;
            if(answers[i] == supoja2[i%8]) scoreCnt[1]++;
            if(answers[i] == supoja3[i%10]) scoreCnt[2]++;
        }

        // 최댓값 구하기
        int max = Math.max(scoreCnt[0], Math.max(scoreCnt[1], scoreCnt[2]));

        // 최대 득점자 리스트
        List<Integer> maximumScoreSupoja = new ArrayList<>();

        // max와 일치하면 리스트에 넣기
        for(int i = 0; i < 3; i++) {
            if(max == scoreCnt[i]) maximumScoreSupoja.add(i+1);
        }

        // 최다 득점자를 인원수만큼 순서대로 배열에 담기
        int[] answer = new int[maximumScoreSupoja.size()];
        for(int i = 0; i < maximumScoreSupoja.size(); i++) {
            answer[i] = maximumScoreSupoja.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        MockExam mockExam = new MockExam();
        int[] mostSupoja= mockExam.solution(answers);

        System.out.println(Arrays.toString(mostSupoja));
    }
}
