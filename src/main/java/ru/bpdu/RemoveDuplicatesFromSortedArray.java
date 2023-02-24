package ru.bpdu;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
 * unique element appears only once. The relative order of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages, you must instead have the result
 * be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first
 * k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 */

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
    }

    //O(N^2)
/*    public static int removeDuplicates(int[] nums) {
        int counter = 1;
        boolean hasStop = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                hasStop = false;
                if (nums[j] > nums[i]) {
                    nums[i + 1] = nums[j];
                    counter++;
                    break;
                } else {
                    hasStop = true;
                }
            }
            if (hasStop) break;
        }
        return counter;
    }*/

    public static int removeDuplicates(int[] nums) {
        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[p] != nums[i]) {
                nums[p+1] = nums[i];
                p++;
            }
        }
        return p + 1;
    }
}
