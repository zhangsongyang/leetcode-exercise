package org.example.impavidity;

/**
 * 125. 验证回文串
 * https://leetcode.cn/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class IsPalindrome {


    public static void main(String[] args) {
        String dd = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(dd));
    }

    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(sb.charAt(left)) != Character.toLowerCase(sb.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
