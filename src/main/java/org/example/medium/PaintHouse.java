package org.example.medium;

/**
 * 256. 粉刷房子
 * 假如有一排房子，共 n 个，每个房子可以被粉刷成红色、蓝色或者绿色这三种颜色中的一种，你需要粉刷所有的房子并且使其相邻的两个房子颜色不能相同。
 *
 * 当然，因为市场上不同颜色油漆的价格不同，所以房子粉刷成不同颜色的花费成本也是不同的。每个房子粉刷成不同颜色的花费是以一个 n x 3 的正整数矩阵 costs 来表示的。
 *
 * 例如，costs[0][0] 表示第 0 号房子粉刷成红色的成本花费；costs[1][2] 表示第 1 号房子粉刷成绿色的花费，以此类推。
 *
 * 请计算出粉刷完所有房子最少的花费成本。
 *
 *
 *
 * 示例 1：
 *
 * 输入: costs = [[17,2,17],[16,16,5],[14,3,19]]
 * 输出: 10
 * 解释: 将 0 号房子粉刷成蓝色，1 号房子粉刷成绿色，2 号房子粉刷成蓝色。
 *      最少花费: 2 + 5 + 3 = 10。
 * 示例 2：
 *
 * 输入: costs = [[7,6,2]]
 * 输出: 2
 *
 *
 * 提示:
 *
 * costs.length == n
 * costs[i].length == 3
 * 1 <= n <= 100
 * 1 <= costs[i][j] <= 20
 */
public class PaintHouse {

    private int[][] costs;

    public int minCost(int[][] costs) {
        if (costs.length == 0) {
            return 0;
        }
        this.costs = costs;
        return Math.min(paintCost(0, 0), Math.min(paintCost(0, 1), paintCost(0, 2)));
    }

    private int paintCost(int n, int color) {
        int total = costs[n][color];
        if (n == costs.length - 1) {

        } else if (color == 0) {
            total += Math.min(paintCost(n + 1, 1), paintCost(n + 1, 2));
        } else if (color == 1) {
            total += Math.min(paintCost(n + 1, 0), paintCost(n + 1, 2));
        } else if (color == 2) {
            total += Math.min(paintCost(n + 1, 0), paintCost(n + 1, 1));
        }
        return total;
    }

    public int minCostTwo(int[][] costs) {
        for(int i=costs.length-2; i >= 0; i--){
            costs[i][0] += Math.min(costs[i+1][1], costs[i+1][2]);
            costs[i][1] += Math.min(costs[i+1][0], costs[i+1][2]);
            costs[i][2] += Math.min(costs[i+1][0], costs[i+1][1]);
        }
        if(costs.length == 0) {
            return 0;
        }
        return Math.min(costs[0][0], Math.min(costs[0][1], costs[0][2]));
    }



        public static void main(String[] args) {
        PaintHouse paintHouse = new PaintHouse();
        int[][] costs = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        int result = paintHouse.minCost(costs);
        System.out.println(result);
        System.out.println(paintHouse.minCostTwo(costs));
    }

}
