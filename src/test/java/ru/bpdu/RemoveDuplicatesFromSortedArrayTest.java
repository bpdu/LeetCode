package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {1,1,2}), 2);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}), 5);
    }
}