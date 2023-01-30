package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt() {
        assertEquals(RomanToInteger.romanToInt("III"), 3);
        assertEquals(RomanToInteger.romanToInt("LVIII"), 58);
        assertEquals(RomanToInteger.romanToInt("MCMXCIV"), 1994);
        assertEquals(RomanToInteger.romanToInt("DCXXI"), 621);

    }
}