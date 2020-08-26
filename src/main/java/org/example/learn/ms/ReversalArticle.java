package org.example.learn.ms;

/**
 * 按索引范围翻转文章片段
 * <p>
 * 输入一个英文文章片段，翻转指定区间的单词顺序，标点符号和普通字母一样处理，
 * 例如输入字符串“I am a developer.”,区间[0,3],则输出“developer.a am I”.
 */
public class ReversalArticle {

    public static String reverseWords(String s, int start, int end) {
        String[] words = s.split(" ");
        for (int i = start, j = end; i < j; i++, j--) {
            String temp = "";
            temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        String result = "";
        for (String word : words) {
            result += word + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        String words = "I am a dev.";
        System.out.println(reverseWords(words, 1, 2));
    }


}
