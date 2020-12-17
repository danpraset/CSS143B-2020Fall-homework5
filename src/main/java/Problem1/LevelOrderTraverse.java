package Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null)
        {
            return result;
        }

        Queue<TreeNode> tq = new LinkedList<>();
        tq.add(root);

        while(tq.size() != 0)
        {
            List<Integer> l1 = new ArrayList<>();
            int tSize = tq.size();

            for (int i = 0; i < tSize; i++) {
                TreeNode<Integer> tni = tq.poll();
                l1.add(tni.val);

                if(tni.left != null)
                {
                    tq.add((tni.left));
                }
                if(tni.right != null)
                {
                    tq.add(tni.right);
                }
            }
            result.add((l1));
        }
        return result;
    }
}
