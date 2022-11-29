package com.likelion.week12.day2;

public class RadixSort04 {
    public static void main(String[] args) {
        int[] array = {2, 8, 18, 13, 1, 7, 16, 7, 0, 14};
        int result = RadixSort04.sort(array);
        System.out.println(result);
    }

    private static int sort(int[] array) {
        int maxDigit = 0;
        for (int i = 0; i < array.length; i++) {
            int digits = (int) (Math.log10(array[i]) + 1);
            if (maxDigit < digits) maxDigit = digits;
        }
        return maxDigit;
    }
}