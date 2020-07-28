package org.example.learn;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    /**
     *
     * add         增加一个元索                      如果队列已满，则抛出一个IIIegaISlabEepeplian异常
     * remove   移除并返回队列头部的元素     如果队列为空，则抛出一个NoSuchElementException异常
     * element  返回队列头部的元素              如果队列为空，则抛出一个NoSuchElementException异常
     * offer       添加一个元素并返回true        如果队列已满，则返回false
     * poll         移除并返问队列头部的元素     如果队列为空，则返回null
     * peek       返回队列头部的元素              如果队列为空，则返回null
     * put         添加一个元素                       如果队列满，则阻塞
     * take        移除并返回队列头部的元素    
     * ————————————————
     * 版权声明：本文为CSDN博主「行者小朱」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/u012050154/article/details/60572567
     *
     * @param args
     */
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
