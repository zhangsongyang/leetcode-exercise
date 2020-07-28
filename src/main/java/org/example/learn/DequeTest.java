package org.example.learn;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 */
public class DequeTest {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);
        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);
        System.out.println("peekFirst:" + deque.peekFirst());
        System.out.println("peekLast:" + deque.peekLast());
        System.out.println("pollFirst:" + deque.pollFirst());
        while (deque.size() > 0) {
            System.out.println(deque.pop());
        }
        System.out.println(deque);

    }

}
