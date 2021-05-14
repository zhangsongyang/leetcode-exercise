package org.example.simpleness;

import java.util.Arrays;

/**
 * LCP 28. 采购方案
 * 难度
 * 简单
 *
 * 14
 *
 * 收藏
 *
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 小力将 N 个零件的报价存于数组 nums。小力预算为 target，假定小力仅购买两个零件，要求购买零件的花费不超过预算，请问他有多少种采购方案。
 *
 * 注意：答案需要以 1e9 + 7 (1000000007) 为底取模，如：计算初始结果为：1000000008，请返回 1
 *
 * 示例 1：
 *
 * 输入：nums = [2,5,3,5], target = 6
 *
 * 输出：1
 *
 * 解释：预算内仅能购买 nums[0] 与 nums[2]。
 *
 * 示例 2：
 *
 * 输入：nums = [2,2,1,9], target = 10
 *
 * 输出：4
 *
 * 解释：符合预算的采购方案如下：
 * nums[0] + nums[1] = 4
 * nums[0] + nums[2] = 3
 * nums[1] + nums[2] = 3
 * nums[2] + nums[3] = 10
 *
 * 提示：
 *
 * 2 <= nums.length <= 10^5
 * 1 <= nums[i], target <= 10^5
 */
public class XyWx {

    public static void main(String[] args) {
        int[] nums = {2,5,3,5};
        int target = 10;
        System.out.println(purchasePlans(nums, target));
    }

    public static int purchasePlans(int[] nums, int target) {
        int mod = 1_000_000_007;
        int anc = 0;
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                anc = anc + (right - left);
                left++;
            }
            anc = anc % mod;
        }
        return anc % mod;
    }



}
