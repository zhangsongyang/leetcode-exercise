package org.example.simpleness;

/**
 * 345. 反转字符串中的元音字母
 *
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "hello"
 * 输出："holle"
 * 示例 2：
 *
 * 输入：s = "leetcode"
 * 输出："leotcede"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class ReverseVowelsOfAString {

    public static String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && !isVowel(arr[i])) {
                i++;
            }
            while (j > 0 && !isVowel(arr[j])) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
