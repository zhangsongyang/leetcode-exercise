package org.example.simpleness;

/**
 * 136. 只出现一次的数字
 * 难度
 * 简单
 *
 * 1793
 *
 * 收藏
 *
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * https://leetcode-cn.com/problems/single-number/
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {7,1,2,1,2};
        System.out.println(singleNumber(nums));

        String str = "aaaabbedd";
        System.out.println(singleString(str));
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single = single ^ num;
        }
        return single;
    }

    /**
     * 做不到游刃有余啊，哎！
     *
     * @param str
     * @return
     */
    public static char singleString(String str) {
        int single = 0;
        for (char c : str.toCharArray()) {
            single = single ^ c;
        }
        return (char)single;
    }

}
