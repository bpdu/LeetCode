package ru.bpdu;

import java.util.Arrays;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
    }

    public static int searchInsert(int[] nums, int target) {
        if (Arrays.binarySearch(nums, target) >= 0) return Arrays.binarySearch(nums, target);
        return -(Arrays.binarySearch(nums, target) + 1);
    }
}
