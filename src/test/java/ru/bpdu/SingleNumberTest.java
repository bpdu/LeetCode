package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumber() {
        assertEquals(SingleNumber.singleNumber(new int[] {2,2,1}), 1);
        assertEquals(SingleNumber.singleNumber(new int[] {4,1,2,1,2}), 4);
        assertEquals(SingleNumber.singleNumber(new int[] {1}), 1);
    }
}