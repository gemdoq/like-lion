package com.likelion.week11.day1;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        int result = ListSum.sum(nums);
        System.out.println(result);
    }

    public static int sum(List<Integer> nums) {
        if(nums.isEmpty()) return 0;

        return sum(nums);
    }
}