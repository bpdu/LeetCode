package ru.bpdu;

public class TwoSum {
    public static void main(String[] args) {
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == nums[i] + target) {
                    return new int[] {i, j};
                }
            }

        }
        return new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};
    }
}