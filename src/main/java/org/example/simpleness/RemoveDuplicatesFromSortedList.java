package org.example.simpleness;

/**
 * 83. 删除排序链表中的重复元素
 * 难度
 * 简单
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNodeHead = new ListNode(1);
        ListNode listNodeB = new ListNode(1);
        ListNode listNodeC = new ListNode(2);
        listNodeHead.next = listNodeB;
        listNodeB.next = listNodeC;
        ListNode head = deleteDuplicates(listNodeHead);
        ListNode temp = head;
        while (null != temp) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}
