package org.example.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 701. 二叉搜索树中的插入操作
 * 难度
 * 中等
 *
 * 113
 *
 * 收藏
 *
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据保证，新值和原始二叉搜索树中的任意节点值都不同。
 *
 * 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回任意有效的结果。
 *
 *
 *
 * 例如,
 *
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和 插入的值: 5
 * 你可以返回这个二叉搜索树:
 *
 *          4
 *        /   \
 *       2     7
 *      / \   /
 *     1   3 5
 * 或者这个树也是有效的:
 *
 *          5
 *        /   \
 *       2     7
 *      / \
 *     1   3
 *          \
 *           4
 *
 *
 * 提示：
 *
 * 给定的树上的节点数介于 0 和 10^4 之间
 * 每个节点都有一个唯一整数值，取值范围从 0 到 10^8
 * -10^8 <= val <= 10^8
 * 新值和原始二叉搜索树中的任意节点值都不同
 */
public class InsertIntoABinarySearchTree {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode cur = root;
        while (cur != null) {
            if (val < cur.val) {
                if (cur.left == null) {
                    cur.left = new TreeNode(val);
                    break;
                } else {
                    cur = cur.left;
                }
            } else {
                if (cur.right == null) {
                    cur.right = new TreeNode(val);
                    break;
                } else {
                    cur = cur.right;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNodeRoot = new TreeNode(4);
        TreeNode treeNodeLvALeft = new TreeNode(2);
        TreeNode treeNodeLvARight = new TreeNode(7);
        TreeNode treeNodeLvBLeft = new TreeNode(1);
        TreeNode treeNodeLvBRight = new TreeNode(3);
        treeNodeRoot.left = treeNodeLvALeft;
        treeNodeRoot.right = treeNodeLvARight;
        treeNodeLvALeft.left = treeNodeLvBLeft;
        treeNodeLvALeft.right = treeNodeLvBRight;
        TreeNode result = insertIntoBST(treeNodeRoot, 5);
        System.out.println(inorderTraversalTop(result));


    }

    /**
     * 前序遍历
     */
    public static List<Integer> inorderTraversalTop(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        helperTop(root, res);
        return res;
    }


    private static void helperTop(TreeNode cur, List<Integer> res) {
        if (null == cur) {
            return;
        }
        res.add(cur.val);
        helperTop(cur.left, res);
        helperTop(cur.right, res);
    }

}
