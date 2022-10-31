package com.likelion.week8.day1;

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
