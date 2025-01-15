import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) {
        var node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right = new TreeNode(7);
        System.out.println(searchBST(node, 5).val);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        var cur = root;
        while (cur.val != val) {
            if (val < cur.val) {
                if (cur.left != null) {
                    cur = cur.left;
                } else {
                    return null;
                }
            } else if (val > cur.val) {
                if (cur.right != null) {
                    cur = cur.right;
                } else {
                    return null;
                }
            }
        }
        return cur;
    }
}