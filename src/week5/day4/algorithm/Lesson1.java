package week5.day4.algorithm;

import java.util.Arrays;

public class Lesson1 {
    public int[] sort(int[] arr) {
        int i = 1;
        if(arr[i] < arr[i-1]) {
            int pointer = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = pointer;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};
        Lesson1 lesson1 = new Lesson1();
        int[] result = lesson1.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}