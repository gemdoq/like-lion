package week5.day4.algorithm;

import java.util.Arrays;

public class Lesson2 {
    public int[] sort(int[] arr, int i) {
        if(arr[i] < arr[i-1]) {
            int pointer = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = pointer;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,6,2,4};
        Lesson2 lesson2 = new Lesson2();
        int[] result = lesson2.sort(arr, 2);

        System.out.println(Arrays.toString(result));
    }
}