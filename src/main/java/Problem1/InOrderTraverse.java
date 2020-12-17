package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode<Integer> tn = root;

        while(!stack.isEmpty() || tn != null)
        {
            while (tn != null)
            {
                stack.push(tn);
                tn = tn.left;
            }

            tn = stack.pop();
            result.add(tn.val);
            tn = tn.right;
        }
        return result;
    }
}
