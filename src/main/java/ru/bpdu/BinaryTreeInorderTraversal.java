package ru.bpdu;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> nodeValues = new ArrayList<>();
        if (root.left == null && root.right == null) {
            nodeValues.add(root.val);
            return nodeValues;
        }
        if (root.left != null) nodeValues.addAll(inorderTraversal(root.left));
        nodeValues.add(root.val);
        if (root.right != null) nodeValues.addAll(inorderTraversal(root.right));
        return nodeValues;
    }

    public static class TreeNode {
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
