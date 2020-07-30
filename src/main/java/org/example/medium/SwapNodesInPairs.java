package org.example.medium;

public class SwapNodesInPairs {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        // If the list has no node or has only one node left.
        if ((head == null) || (head.next == null)) {
            return head;
        }

        // Nodes to be swapped
        ListNode firstNode = head;
        ListNode secondNode = head.next;

        // Swapping
        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        // Now the head is the second node
        return secondNode;
    }

    public static void main(String[] args) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode listNodeA = new ListNode(1);
        ListNode listNodeB = new ListNode(2);
        ListNode listNodeC = new ListNode(3);
        ListNode listNodeD = new ListNode(4);
        listNodeA.next = listNodeB;
        listNodeB.next = listNodeC;
        listNodeC.next = listNodeD;
        listNodeD.next = null;
        ListNode result = swapNodesInPairs.swapPairs(listNodeA);

    }


}
