package org.example.learn;

import java.util.PriorityQueue;

/**
 * 优先队列
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("b");
        priorityQueue.add("11");
        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("1");
        priorityQueue.offer("-2");

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
//        priorityQueue.

    }
}
