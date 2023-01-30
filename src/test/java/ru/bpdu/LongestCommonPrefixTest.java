package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        assertEquals(LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}), "fl");
        assertEquals(LongestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}), "");
    }
}