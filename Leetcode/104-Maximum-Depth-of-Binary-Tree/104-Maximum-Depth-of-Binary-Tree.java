/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return recMaxDepth(root, 0);
    }

    private int recMaxDepth(TreeNode root, int currDepth) {
        if (root == null) {
            return currDepth;
        }

        currDepth++;

        return Math.max(recMaxDepth(root.left, currDepth), recMaxDepth(root.right, currDepth));
    }
}