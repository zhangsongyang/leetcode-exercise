package org.example.learn;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    /**
     * 1、add()和offer()区别:
     * <p>
     * add()和offer()都是向队列中添加一个元素。一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，调用 add() 方法就会抛出一个 unchecked 异常，而调用 offer() 方法会返回 false。因此就可以在程序中进行有效的判断！
     * <p>
     *
     * 2、poll()和remove()区别：
     * <p>
     * remove() 和 poll() 方法都是从队列中删除第一个元素。如果队列元素为空，调用remove() 的行为与 Collection 接口的版本相似会抛出异常，但是新的 poll() 方法在用空集合调用时只是返回 null。因此新的方法更适合容易出现异常条件的情况。
     * <p>
     *
     * 3、element() 和 peek() 区别：
     * <p>
     * element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。
     * 下面是Java中Queue的一些常用方法：
     * add         增加一个元索                      如果队列已满，则抛出一个IIIegaISlabEepeplian异常
     * remove   移除并返回队列头部的元素     如果队列为空，则抛出一个NoSuchElementException异常
     * element  返回队列头部的元素              如果队列为空，则抛出一个NoSuchElementException异常
     * offer       添加一个元素并返回true        如果队列已满，则返回false
     * poll         移除并返问队列头部的元素     如果队列为空，则返回null
     * peek       返回队列头部的元素              如果队列为空，则返回null
     * put         添加一个元素                       如果队列满，则阻塞
     * take        移除并返回队列头部的元素
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
