package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void validParentheses() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertFalse(ValidParentheses.isValid("(]"));
        assertFalse(ValidParentheses.isValid("([)]"));
        assertTrue(ValidParentheses.isValid("{[]}"));
        assertTrue(ValidParentheses.isValid("(([]){})"));
        assertTrue(ValidParentheses.isValid("[({(())}[()])]"));
        assertTrue(ValidParentheses.isValid("[]()[()()][{}]()"));
    }
}