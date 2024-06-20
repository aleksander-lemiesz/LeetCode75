import java.util.ArrayList;
import java.util.List;

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
class LeafSim {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return getLeafs(root1).equals(getLeafs(root2));
    }

    private List<Integer> getLeafs(TreeNode root) {
        var leafs = new ArrayList<Integer>();
        if (root.left == null && root.right == null) leafs.add(root.val);
        if (root.left != null) leafs.addAll(getLeafs(root.left));
        if (root.right != null) leafs.addAll(getLeafs(root.right));
        return leafs;
    }
}