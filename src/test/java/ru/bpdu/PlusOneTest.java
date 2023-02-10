package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void plusOne() {
        assertArrayEquals(PlusOne.plusOne(new int[] {1,2,3}), new int[] {1,2,4});
        assertArrayEquals(PlusOne.plusOne(new int[] {4,3,2,1}), new int[] {4,3,2,2});
        assertArrayEquals(PlusOne.plusOne(new int[] {9}), new int[] {1,0});
    }
}