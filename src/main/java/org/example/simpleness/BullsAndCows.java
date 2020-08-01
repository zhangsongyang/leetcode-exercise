package org.example.simpleness;

import java.util.HashMap;

/**
 * 你在和朋友一起玩 猜数字（Bulls and Cows）游戏，该游戏规则如下：
 *
 * 你写出一个秘密数字，并请朋友猜这个数字是多少。
 * 朋友每猜测一次，你就会给他一个提示，告诉他的猜测数字中有多少位属于数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位属于数字猜对了但是位置不对（称为“Cows”, 奶牛）。
 * 朋友根据提示继续猜，直到猜出秘密数字。
 * 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，返回字符串的格式为 xAyB ，x 和 y 都是数字，A 表示公牛，用B表示奶牛。
 *
 * xA 表示有 x 位数字出现在秘密数字中，且位置都与秘密数字一致。
 * yB 表示有 y 位数字出现在秘密数字中，但位置与秘密数字不一致。
 * 请注意秘密数字和朋友的猜测数都可能含有重复数字，每位数字只能统计一次。
 *
 * 
 *
 * 示例 1:
 *
 * 输入: secret = "1807", guess = "7810"
 * 输出: "1A3B"
 * 解释: 1公牛和3奶牛。公牛是 8，奶牛是 0, 1和 7。
 * 示例 2:
 *
 * 输入: secret = "1123", guess = "0111"
 * 输出: "1A1B"
 * 解释: 朋友猜测数中的第一个 1是公牛，第二个或第三个 1可被视为奶牛。
 * 
 *
 * 说明: 你可以假设秘密数字和朋友的猜测数都只包含数字，并且它们的长度永远相等。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bulls-and-cows
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class BullsAndCows {

    public static String getHint(String secret, String guess) {
        int A = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
            }
        }
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapG = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            mapS.put(secret.charAt(i), mapS.getOrDefault(secret.charAt(i), 0) + 1);
            mapG.put(guess.charAt(i), mapG.getOrDefault(guess.charAt(i), 0) + 1);
        }
        int B = 0;
        for (Character key : mapG.keySet()) {
            int n1 = mapG.getOrDefault(key, 0);
            int n2 = mapS.getOrDefault(key, 0);
            B = B + Math.min(n1, n2);
        }
        return A + "A" + (B - A) + "B";
    }


    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0111";
        System.out.println(BullsAndCows.getHint(secret, guess));
    }

}
