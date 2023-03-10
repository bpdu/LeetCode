package ru.bpdu;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
    }

    //O(N^2)
    /* public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[] {i, j};
                }
            }

        }
        return new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};
    }
    */
    //O(N)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j]) && map.get(nums[j]) != j) {
                return new int[] {j, map.get(nums[j])};
            }
        }
        return new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};
    }



}