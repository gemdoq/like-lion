package com.likelion.week13.day3;

import java.util.PriorityQueue;

public class MixUpScoville01 {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;
        int cnt = MixUpScoville01.overK(scoville, k);
        System.out.printf("Number of times mixed : %d%n", cnt);
    }

    private static int overK(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for (int scov:scoville) {
            heap.add(scov);
        }
        while(heap.peek() < k) {
            if(heap.size() == 1) return -1;
            int leftChildScov = heap.poll();
            int rightChildScov = heap.poll();
            int parentScov = leftChildScov + 2 * rightChildScov;
            heap.add(parentScov);
            answer++;
        }
        return answer;
    }
}