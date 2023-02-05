package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOLastWordTest {

    @Test
    void lengthOfLastWord() {
        assertEquals(LengthOLastWord.lengthOfLastWord("Hello World"),5);
        assertEquals(LengthOLastWord.lengthOfLastWord("   fly me   to   the moon  "),4);
        assertEquals(LengthOLastWord.lengthOfLastWord("luffy is still joyboy"),6);

    }
}