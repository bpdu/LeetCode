package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs() {
        assertEquals(ClimbingStairs.climbStairs(2), 2);
        assertEquals(ClimbingStairs.climbStairs(3), 3);
        assertEquals(ClimbingStairs.climbStairs(4), 5);
        assertEquals(ClimbingStairs.climbStairs(5), 8);
        assertEquals(ClimbingStairs.climbStairs(6), 13);
        assertEquals(ClimbingStairs.climbStairs(7), 21);
        assertEquals(ClimbingStairs.climbStairs(8), 34);
        assertEquals(ClimbingStairs.climbStairs(9), 55);
        assertEquals(ClimbingStairs.climbStairs(10), 89);
        assertEquals(ClimbingStairs.climbStairs(20), 10946);
        assertEquals(ClimbingStairs.climbStairs(45), 1836311903);

    }
}