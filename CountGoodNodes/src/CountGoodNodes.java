import misc.TreeNode;

public class CountGoodNodes {
    public int goodNodes(TreeNode root) {
        int max = root.val;
        int goodNodes = 1;
        if (root.left != null) goodNodes += goodNodeMax(root.left, max);
        if (root.right != null) goodNodes += goodNodeMax(root.right, max);
        return goodNodes;
    }

    public int goodNodeMax(TreeNode node, int max) {
        int goodNodes = 0;
        if (node.val >= max) {
            goodNodes++;
            max = node.val;
        }
        if (node.left != null) goodNodes += goodNodeMax(node.left, max);
        if (node.right != null) goodNodes += goodNodeMax(node.right, max);
        return goodNodes;
    }
}
