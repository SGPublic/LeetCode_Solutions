package daily.Y2021.Nov.Nov26_SearchInABinarySearchTree;

import util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private int val;

    public TreeNode searchBST(TreeNode root, int val) {
        this.val = val;
        return dfs(root);
    }

    private TreeNode dfs(TreeNode node) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        TreeNode left = dfs(node.left);
        TreeNode right = dfs(node.right);
        return left == null ? right : left;
    }
}