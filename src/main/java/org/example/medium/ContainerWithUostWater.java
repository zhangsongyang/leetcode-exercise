package org.example.medium;

/**
 * 11. 盛最多水的容器
 * 难度
 * 中等
 * <p>
 * 1944
 * <p>
 * 收藏
 * <p>
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 * 示例：
 * <p>
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class ContainerWithUostWater {

    public static int maxAreaB(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            int temp = Math.min(height[left], height[right]) * (right -left);
            area = Math.max(area, temp);
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return area;
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (left < right) {
            int areaA = Math.min(height[left], height[right]) * (right - left);
            area = Math.max(area, areaA);
            if (height[left] < height[right]) {
                ++left;
            } else {
                --right;
            }
        }
        return area;
    }

    public static int maxAreaA(int[] height) {
        int area = 0;
        for(int i=0; i< height.length; i++){
            for(int j=i+1; j< height.length; j++){
                area = Math.max(Math.min(height[i], height[j]) * (j-i), area);
            }
        }
        return area;
    }


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
        System.out.println(maxAreaA(height));
        System.out.println(maxAreaB(height));
    }
}
