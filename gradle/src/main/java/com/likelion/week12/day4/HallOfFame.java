package com.likelion.week12.day4;

import java.util.PriorityQueue;

public class HallOfFame {
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] results = HallOfFame.solution(k, score);
        for (int result : results) {
            System.out.printf("%d%n", result);
        }
    }

    private static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < score.length; i++) {
            if(priorityQueue.size() < k) {
                priorityQueue.add(score[i]);
            } else if (priorityQueue.peek() < score[i]) {
                priorityQueue.poll();
                priorityQueue.add(score[i]);
            }
            answer[i] = priorityQueue.peek();
        }
        return answer;
    }
}