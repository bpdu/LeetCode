package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        assertEquals(SearchInsertPosition.searchInsert(new int[] {1,3,5,6}, 5), 2);
        assertEquals(SearchInsertPosition.searchInsert(new int[] {1,3,5,6}, 2), 1);
        assertEquals(SearchInsertPosition.searchInsert(new int[] {1,3,5,6}, 7), 4);
        assertEquals(SearchInsertPosition.searchInsert(new int[] {1}, 1), 0);

    }
}