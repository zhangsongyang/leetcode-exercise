package org.example.simpleness;


import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历（）
 * <p>
 * 给定一个二叉树，返回它的中序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BinarytreeInorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        helper(root, res);
        return res;
    }

    /**
     * 中序遍历
     *
     * @param cur
     * @param res
     */
    private static void helper(TreeNode cur, List<Integer> res) {
        if (null == cur) {
            return;
        }
        helper(cur.left, res);
        res.add(cur.val);
        helper(cur.right, res);
    }

    public static List<Integer> inorderTraversalTop(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        helperTop(root, res);
        return res;
    }

    /**
     * 前序遍历
     *
     * @param cur
     * @param res
     */
    private static void helperTop(TreeNode cur, List<Integer> res) {
        if (null == cur) {
            return;
        }
        res.add(cur.val);
        helperTop(cur.left, res);
        helperTop(cur.right, res);
    }

    public static List<Integer> inorderTraversalAfter(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        helperAfter(root, res);
        return res;
    }

    /**
     * 后序遍历
     *
     * @param cur
     * @param res
     */
    private static void helperAfter(TreeNode cur, List<Integer> res) {
        if (null == cur) {
            return;
        }
        helperAfter(cur.left, res);
        helperAfter(cur.right, res);
        res.add(cur.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode l1 = new TreeNode(4);
        TreeNode r1 = new TreeNode(6);
        l1.left = new TreeNode(1);
        l1.right = new TreeNode(2);
        r1.left = new TreeNode(7);
        r1.right = new TreeNode(8);
        root.left = l1;
        root.right = r1;
        System.out.println("前序遍历:" + inorderTraversalTop(root));
        System.out.println("中序遍历:" + inorderTraversal(root));
        System.out.println("后序遍历:" + inorderTraversalAfter(root));
    }

}
