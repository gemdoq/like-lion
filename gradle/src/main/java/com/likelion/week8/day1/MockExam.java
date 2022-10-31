package com.likelion.week8.day1;


/* 수포자들 반복패턴을 추출
반복패턴이 정답과 일치하면 점수를 합산할 카운트배열 3칸 생성
정답의 첫 요소부터 마지막 요소까지 돌면서 수포자들의 답안에 있는지 확인해서 있으면 해당하는 수포자의 카운트를 증가
최댓값을 구하고, 최대값과 같으면 리스트에 넣는다.
리스트의 요소의 숫자만큼의 배열을 만든다.
만든 배열에 리스트의 첫 요소부터 마지막 요소까지 돌면서 담는다.
 */
public class MockExam {
    public int[] solution(int[] answers) {
        int[] answer = {};


        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        MockExam mockExam = new MockExam();
        int[] mostSupoja= mockExam.solution(answers);

        System.out.println(mostSupoja);
    }
}
