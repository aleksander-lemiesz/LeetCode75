import misc.TreeNode;

/**
 * Definition for a binary tree node.
 * public class misc.TreeNode {
 *     int val;
 *     misc.TreeNode left;
 *     misc.TreeNode right;
 *     misc.TreeNode() {}
 *     misc.TreeNode(int val) { this.val = val; }
 *     misc.TreeNode(int val, misc.TreeNode left, misc.TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MaxDepthOfTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}