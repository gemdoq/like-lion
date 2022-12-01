package com.likelion.week12.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class HallOfFame {
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] results = HallOfFame.priorityQueueSolution(k, score);
        for (int result : results) {
            System.out.printf("%d%n", result);
        }
        int[] results2 = HallOfFame.arraySolution(k, score);
        for (int result : results2) {
            System.out.printf("%d%n", result);
        }
    }

    private static int[] priorityQueueSolution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
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

    private static int[] arraySolution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> honorList = new ArrayList<>();
        ArrayList<Integer> removeList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (i >= k) {
                if (score[i] > honorList.get(0)) {
                    honorList.add(score[i]);
                    honorList.remove(honorList.get(0));
                }
            }
            else{
                honorList.add(score[i]);
            }
            Collections.sort(honorList);
            removeList.add(honorList.get(0));
        }

        for (int i = 0; i < removeList.size(); i++) {
            answer[i] = removeList.get(i);
        }
        return answer;
    }
}