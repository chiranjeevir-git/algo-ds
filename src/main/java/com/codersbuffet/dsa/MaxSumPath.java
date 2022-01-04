package com.codersbuffet.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TreeNode {

    public int value;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;

    }
}

public class MaxSumPath {
    public static int maxSum = 0;
    public static boolean thisPath = false;

    public static int getMaxSum(TreeNode root, int sum) {

        if (root.left == null && root.right == null) {
            sum += root.value;
            return sum;
        }

        int leftSum = getMaxSum(root.left, sum);
        int rightSum = getMaxSum(root.right, sum);
        sum = Math.max(leftSum, rightSum) + root.value;
        return sum;

    }

    public static boolean printMaxSumPath(TreeNode root, int sum, int target) {
        sum -= root.value;

        if (root.left == null && root.right == null) {
            if (sum == 0) {
                System.out.println(root.value);
                return true;
            } else {
                return false;
            }
        }

        boolean leftSum = printMaxSumPath(root.left, sum, target);
        boolean rightSum = printMaxSumPath(root.right, sum, target);

        if (leftSum || rightSum) {
            System.out.println(root.value);
        }

            return leftSum || rightSum;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(getMaxSum(root, 0));
        printMaxSumPath(root, 11, 11);
        String name ="1,2,3";
        List<Integer> list = Arrays.stream(name.split(",")).map(Integer::valueOf).collect(Collectors.toList());
    }
}
