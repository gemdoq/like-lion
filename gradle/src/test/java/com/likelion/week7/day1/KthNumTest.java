package com.likelion.week7.day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthNumTest {
    @Test
    void kthNumTest() {
        int[] arr = new int[]{1,5,2,6,3,7,4};
        int[][] commands = new int[][]{{2,5,3},{4,4,1},{1,7,3}};

        KthNum kthNum = new KthNum();
        kthNum.solution(arr, commands);
    }

    @Test
    void kthNum2Test() {
        int[] arr = new int[]{1,5,2,6,3,7,4};
        int[][] commands = new int[][]{{2,5,3},{4,4,1},{1,7,3}};

        KthNum2 kthNum2 = new KthNum2();
        kthNum2.solution(arr, commands);
    }
}