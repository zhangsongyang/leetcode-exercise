package org.example.learn;

import org.example.learn.bean.User;
import org.example.learn.bean.UserComparator;

import java.util.PriorityQueue;

/**
 * 优先队列
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.peek());
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空

    }
}
