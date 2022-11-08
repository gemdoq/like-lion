package com.likelion.week9.day2;

public class BinarySearch01 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int targetValue = 7;

        int startIdx = 0;
        int endIdx = nums.length - 1;

        while (startIdx <= endIdx) {
            int midIdx = (startIdx+endIdx)/2;
            int midValue = nums[midIdx];

            if(midValue < targetValue) {
                startIdx = midIdx + 1;
            } else if (midValue > targetValue) {
                endIdx = midIdx - 1;
            } else {
                System.out.println(midIdx);
                break;
            }
        }
    }
}