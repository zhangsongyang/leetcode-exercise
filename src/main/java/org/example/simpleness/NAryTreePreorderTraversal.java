package org.example.simpleness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * <p>
 * 例如，给定一个 3叉树 :
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
public class NAryTreePreorderTraversal {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    /**
     * 递归写法
     *
     * @param root
     * @return
     */
    public static List<Integer> preorderDigui(Node root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new LinkedList<>();
        leve(root, list);
        return list;
    }

    private static void leve(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (null != root.children) {
            root.children.forEach((node) -> {
                leve(node, list);
            });
        }

    }

    /**
     * 迭代写法 其实就是 BFS的思路
     *
     * @param root
     * @return
     */
    public static List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            if (null != node.children) {
                Collections.reverse(node.children);
                for (Node item : node.children) {
                    stack.add(item);
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Node> children = new ArrayList<>();
        Node root = new Node(1, children);
        List<Node> leftChildren = new ArrayList<>();
        Node nodeThree = new Node(3, leftChildren);
        children.add(nodeThree);
        children.add(new Node(2));
        children.add(new Node(4));
        leftChildren.add(new Node(5));
        leftChildren.add(new Node(6));
        System.out.println(preorder(root));
    }

}
