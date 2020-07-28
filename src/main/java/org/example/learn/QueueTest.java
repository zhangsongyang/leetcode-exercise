package org.example.learn;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        System.out.println(queue);
        String polledElement = queue.poll();
        System.out.println(polledElement);
        System.out.println(queue);
        String peekedElement = queue.peek();
        System.out.println(peekedElement);
        System.out.println(queue);
        System.out.println("@@@@@@@@");
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
        System.out.println(queue);
    }

}
