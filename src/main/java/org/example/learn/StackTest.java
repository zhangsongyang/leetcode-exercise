package org.example.learn;

import java.util.Stack;

/**
 *
 */
public class StackTest {


    /**
     * Stack.Peek 与 stack.pop 的区别
     * 相同点：大家都返回栈顶的值。
     * 不同点：peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除。
     *
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.search(4));
        stack.pop();
        stack.pop();
        Integer topElement = stack.peek();
        System.out.println(topElement);
        System.out.println(" 3的位置 " + stack.search(3));
    }

}
