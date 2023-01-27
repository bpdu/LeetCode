package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
/*
        assertArrayEquals(TwoSum.twoSum(new int[] {2,7,11,15}, 9), new int[] {0, 1});
*/
        assertArrayEquals(TwoSum.twoSum(new int[] {3,2,4}, 6), new int[] {1, 2});
        assertArrayEquals(TwoSum.twoSum(new int[] {3,3}, 6), new int[] {0, 1});
    }
}