package org.example.impavidity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
 * 
 */
public class IsSubsequence {

    public static void main(String[] args) {
//        String s = "abc", t = "ahbgdc";
//        String s = "axc", t = "ahbgdc";
        String s = "b", t = "abc";
        System.out.println(isSubsequence(s, t));


    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int sCount = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(sCount)) {
                sCount++;
            }
            if (sCount == s.length()) {
                return true;
            }
        }
        return false;
    }


}
