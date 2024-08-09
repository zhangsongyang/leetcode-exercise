package org.example.impavidity;

/**
 * 80.删除排序数组中的重复项 II
 */
public class RemoveDuplicatesTwo {


    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2;
        int fast = 2;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
