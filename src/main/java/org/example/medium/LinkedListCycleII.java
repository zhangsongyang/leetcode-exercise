package org.example.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. 环形链表 II
 * 难度
 * 中等
 *
 * 691
 *
 * 收藏
 *
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 说明：不允许修改给定的链表。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：tail connects to node index 1
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 *
 * 示例 2：
 *
 * 输入：head = [1,2], pos = 0
 * 输出：tail connects to node index 0
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 *
 * 示例 3：
 *
 * 输入：head = [1], pos = -1
 * 输出：no cycle
 * 解释：链表中没有环。
 *
 *
 *
 *
 * 进阶：
 * 你是否可以不用额外空间解决此题？
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycleII {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public static ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode pos = head;
        while (null != pos) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

    public ListNode detectCycleB(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        ListNode listNodeA = new ListNode(3);
        ListNode listNodeB = new ListNode(2);
        ListNode listNodeC = new ListNode(0);
        ListNode listNodeD = new ListNode(-4);
        listNodeA.next = listNodeB;
        listNodeB.next = listNodeC;
        listNodeC.next = listNodeD;
        listNodeD.next = listNodeB;
        System.out.println(detectCycle(listNodeA).val);


    }

}
