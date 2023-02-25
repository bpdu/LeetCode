package ru.bpdu;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */
public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return btValue(p).equals(btValue(q));
    }

    public static List<String> btValue(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<String> nodeValues = new ArrayList<>();
        if (root.left == null && root.right == null) {
            nodeValues.add(String.valueOf(root.val));
            nodeValues.add("");
            nodeValues.add("");
        } else if (root.left == null) {
            nodeValues.add(String.valueOf(root.val));
            nodeValues.add("");
            nodeValues.addAll(btValue(root.right));
        } else if (root.right == null) {
            nodeValues.add(String.valueOf(root.val));
            nodeValues.addAll(btValue(root.left));
            nodeValues.add("");
        } else {
            nodeValues.add(String.valueOf(root.val));
            nodeValues.addAll(btValue(root.left));
            nodeValues.addAll(btValue(root.right));
        }
        return nodeValues;
    }

    public static void main(String[] args) {
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
