import com.sun.source.tree.Tree;

import java.util.*;

public class BinTreeRSV {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public List<Integer> rightSideView(TreeNode root) {
        var res = new ArrayList<Integer>();
        var q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode rightSide = null;
            int depth = q.size();

            for (int i = 0; i < depth; i++) {
                TreeNode node = q.poll();
                if (node != null) {
                    rightSide = node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if (rightSide != null)
                res.add(rightSide.val);
        }
        return res;
    }
}