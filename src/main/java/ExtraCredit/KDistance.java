package ExtraCredit;

import Problem1.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KDistance {
    public static List<Integer> distanceK(TreeNode<Integer> root, TreeNode<Integer> target, int k) {

        List<Integer> result = new ArrayList<>();

        if (k == 0) {
            result.add(target.val);
        }

        else {
            distanceDisplay(result, root, target.val, k, 0);
        }
        return result;
    }

    private static int distanceDisplay(List<Integer> result, TreeNode<Integer> root, int target, int k, int distance) {

        int rightDistance;
        int leftDistance;

        if (root == null) {
            return 0;
        }

        if (distance == k) {
            result.add(root.val);
            return 0;
        }


        if (root.val == target || distance > 0) {
            rightDistance = distanceDisplay(result, root.right, target, k, distance + 1);
            leftDistance = distanceDisplay(result, root.left, target, k, distance + 1);
        }

        else {
            rightDistance = distanceDisplay(result, root.right, target, k, distance);
            leftDistance = distanceDisplay(result, root.left, target, k, distance);
        }

        if (root.val == target) {
            return 1;
        }

        if (leftDistance == k || rightDistance == k) {
            result.add(root.val);
            return 0;
        }

        if (rightDistance > 0) {
            distanceDisplay(result, root.left, target, k, rightDistance + 1);
            return rightDistance + 1;
        }

        if (leftDistance > 0) {
            distanceDisplay(result, root.right, target, k, leftDistance + 1);
            return leftDistance + 1;
        }



        return 0;

    }
}
