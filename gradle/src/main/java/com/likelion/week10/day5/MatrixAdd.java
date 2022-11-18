package com.likelion.week10.day5;

import java.util.Arrays;

public class MatrixAdd {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        MatrixAdd matrixAdd = new MatrixAdd();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        matrixAdd.solution(arr1, arr2);
    }

}