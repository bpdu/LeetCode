package ru.bpdu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    @Test
    void isSameTree() {
/*        assertTrue(SameTree.isSameTree(
                new SameTree.TreeNode(1,
                        new SameTree.TreeNode(2, null, null),
                        new SameTree.TreeNode(3, null, null)),
                new SameTree.TreeNode(1,
                        new SameTree.TreeNode(2, null, null),
                        new SameTree.TreeNode(3, null, null))));*/

        assertFalse(SameTree.isSameTree(
                new SameTree.TreeNode(1,
                        new SameTree.TreeNode(2, null, null),
                        null),
                new SameTree.TreeNode(1,
                        null,
                        new SameTree.TreeNode(2, null, null))));
    }
}