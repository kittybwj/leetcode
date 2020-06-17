//给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, 
//ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 
//
// 说明：你不能倾斜容器，且 n 的值至少为 2。 
//
// 
//
// 
//
// 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。 
//
// 
//
// 示例： 
//
// 输入：[1,8,6,2,5,4,8,3,7]
//输出：49 
// Related Topics 数组 双指针

//思路一：暴力法，枚举。两层循环比较所有的情况，记录最大的面积值。
//思路二：左右夹逼法，左右边界，同时向中间收敛。O(n),只有一层循环。
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int left = 0, right = height.length - 1; left < right; ) {
            minHeight = height[left] < height[right] ? height[left] : height[right];
            max = Math.max(max, )
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
/* 思路一：暴力法
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        // 注意循环边界值，不重复(两层循环要写的很熟练！)
        for (int left = 0; left < height.length - 1; left++) {
            for (int right = left + 1; right < height.length; right ++) {
                int area = (right - left) * Math.min(height[left], height[right]);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
*/
