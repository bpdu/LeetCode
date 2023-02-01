package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Remove_Duplicates_From_Sorted_ArrayTest {

    @Test
    void removeDuplicates() {
        assertEquals(Remove_Duplicates_From_Sorted_Array.removeDuplicates(new int[] {1,1,2}), 2);
        assertEquals(Remove_Duplicates_From_Sorted_Array.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}), 5);
    }
}