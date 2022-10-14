package week5.day4.algorithm;

import java.util.Arrays;

public class Lesson2 {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                if (arr[j] < arr[j - 1]) { // if(condition) { swap; }
                    int pointer = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = pointer;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,6,2,4};
        Lesson2 lesson2 = new Lesson2();
        int[] result = lesson2.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}