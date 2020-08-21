package org.example.medium;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 *
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 *  
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BinaryTreeLevelOrderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * BFS 遍历使用队列数据结构 (这里是非层序遍历)
     *
     * @param root
     * @return
     */
    public static List<Integer> lOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return res;
    }

    /**
     * BFS 层序遍历
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(level);
        }

        return res;
    }


    /**
     * DFS
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> dfs(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null) {
            return allResults;
        }
        travel(root, 0, allResults);
        return allResults;
    }


    private static void travel(TreeNode root, int level, List<List<Integer>> results) {
        if (results.size() == level) {
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if (root.left != null) {
            travel(root.left, level + 1, results);
        }
        if (root.right != null) {
            travel(root.right, level + 1, results);
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode leftOne = new TreeNode(9);
        TreeNode rightOne = new TreeNode(20);
        TreeNode lefttTwo = new TreeNode(15);
        TreeNode rightTwo = new TreeNode(7);

        root.left = leftOne;
        root.right = rightOne;

        rightOne.left = lefttTwo;
        rightOne.right = rightTwo;

        System.out.println(lOrder(root));
        List<List<Integer>> lists = levelOrder(root);
        lists.forEach((result) -> {
            System.out.println(result.toString());
        });
        System.out.println("-----------------");
        List<List<Integer>> listss = dfs(root);
        listss.forEach((result) -> {
            System.out.println(result.toString());
        });

    }
}
