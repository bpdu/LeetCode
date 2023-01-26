package ru.bpdu;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
    }

    //O(n^2)
    /* public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[] {i, j};
                }
            }

        }
        return new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};
    }*/

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i] - target);
        }
        for (int j = 1; j < nums.length; j++) {
            if (map.containsValue(nums[j]) {
                return new int[] {map.keySet ,j}
            }
        }
    }



}