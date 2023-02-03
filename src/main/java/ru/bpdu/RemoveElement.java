package ru.bpdu;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order
 * of the elements may be changed.
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be
 * placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result. It does not matter what you leave beyond the
 * first k elements.
 * Return k after placing the final result in the first k slots of nums.
 */

public class RemoveElement {

    public static void main(String[] args) {
    }

    //O(N^2)
/*    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        if ((nums.length == 1) && (nums[0] == val)) {
            nums[0] = 0;
            return 0;
        }
        int p = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            int k = 0;
            while (nums[i] == val && i < l - p) {
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                    k++;
                }
                if (k != 0) nums[l - 1] = 0;
                p++;
            }

        }
        return nums.length - p;
    }*/

    //O(N)
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }


    }
