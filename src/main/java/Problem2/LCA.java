package Problem2;

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {

        if(root == null || root == p || root == q)
        {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null)
        {
            return right;
        }


        if(right == null)
        {
            return left;
        }

        if(left == null && right == null)
        {
            return null;
        }

        else {
            return root;
        }
    }
}
