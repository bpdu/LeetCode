package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void addBinary() {
        assertEquals(AddBinary.addBinary("11", "1"), "100");
        assertEquals(AddBinary.addBinary("1010", "1011"), "10101");
    }
}