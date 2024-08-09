package org.example.impavidity;

/**
 * 26.删除排序数组中的重复项
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                nums[slow + 1] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow + 1;
    }

}
