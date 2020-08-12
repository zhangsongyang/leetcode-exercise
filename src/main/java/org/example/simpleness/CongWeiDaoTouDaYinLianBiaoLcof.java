package org.example.simpleness;

import java.util.Stack;

/**
 * 从尾到头打印链表
 * <p>
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 10000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CongWeiDaoTouDaYinLianBiaoLcof {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (null != temp) {
            stack.push(temp.val);
            temp = temp.next;
        }
        int[] result = new int[stack.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode secordNode = new ListNode(3);
        ListNode thridNode = new ListNode(2);
        root.next = secordNode;
        secordNode.next = thridNode;
        thridNode.next = null;
        int[] result = reversePrint(root);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
