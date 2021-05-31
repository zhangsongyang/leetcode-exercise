package org.example.simpleness;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 难度
 * 简单
 *
 * 2264
 *
 * 收藏
 *
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅由括号 '()[]{}' 组成
 *
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c == '{'){
                stack.push('}');
            } else if (c == '('){
                stack.push(')');
            } else if(c == '['){
                stack.push(']');
            } else if(stack.isEmpty() || stack.pop() !=c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        String ss = "(]";
        String sss = "";
        System.out.println(isValidTwo(s));
        System.out.println(isValidTwo(ss));
        System.out.println(isValidTwo(sss));
    }

    public static boolean isValidTwo(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            } else if(c == '[') {
                stack.push(']');
            } else if(c == '{') {
                stack.push('}');
            } else if(stack.isEmpty() ||stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

}
