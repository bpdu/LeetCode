package ru.bpdu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array
 * nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the
 * elements that should be merged, and the last n elements are set to 0 and should be ignored.
 * nums2 has a length of n.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int j = 0; j < n; j++) {
            list.add(nums2[j]);
        }
        Collections.sort(list);
        for (int k = 0; k < m + n; k++) {
            nums1[k] = list.get(k);
        }
    }
}
