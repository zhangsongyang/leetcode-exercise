package org.example.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：["()"]
 *
 *
 * 提示：
 *
 * 1 <= n <= 8
 *
 * https://leetcode-cn.com/problems/generate-parentheses/
 */
public class GenerateParentheses {

    public static List<String> generateParenthesisTest(int n) {
        List<String> result = new ArrayList<String>();
        generateAllTest(new char[2*n], 0, result);
        return result;
    }

    public static void generateAllTest(char[] current, int pos, List<String> result) {
        if (current.length == pos) {
//            if (validTest(current)) {
                result.add(new String(current));
//            }
        } else {
            current[pos] = '(';
            generateAllTest(current, pos + 1, result);
            current[pos] = ')';
            generateAllTest(current, pos + 1, result);
        }
    }

    private static boolean validTest(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }


    public static void main(String[] args) {
        List<String> list = generateParenthesis(1);
//        List<String> list = generateParenthesisTest(1);
        int i =0;
        for (String s : list) {
            System.out.println(s + " " + (++i));
        }

    }


    public static List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<String>();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public static void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {

            if (valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    public static boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                ++balance;
            } else {
                --balance;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
}


