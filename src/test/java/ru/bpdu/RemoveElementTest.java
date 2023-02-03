package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {

        assertEquals(RemoveElement.removeElement(new int[] {3,2,2,3}, 3), 2);
        assertEquals(RemoveElement.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2), 5);
        assertEquals(RemoveElement.removeElement(new int[] {1}, 1), 0);
        assertEquals(RemoveElement.removeElement(new int[] {}, 0), 0);
        assertEquals(RemoveElement.removeElement(new int[] {4,5}, 5), 1);
        assertEquals(RemoveElement.removeElement(new int[] {4,4,0,1,0,2}, 0), 4);




    }
}