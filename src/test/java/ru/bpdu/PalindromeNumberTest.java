package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindromeNumber() {
        assertTrue(PalindromeNumber.isPalindromeNumber(121));
        assertFalse(PalindromeNumber.isPalindromeNumber(-121));
        assertFalse(PalindromeNumber.isPalindromeNumber(10));
    }
}