//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 输入: [2,1]
//输出: [2,1]
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针

//思路一：用一个count记录0的数量，从头遍历，如果当前数组前面有0，就向前移动count个位置。数组最后count个数都置为0(自己想到的)
//思路二：新开一个数组，非零元素往新数组前面放，为零的元素往数组后面放（不符合题目中必须在原数组上操作的要求）
//思路三：直接在原数组操作，用j记录非0元素即将被移动的位置
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroFlag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != zeroFlag) {
                    nums[zeroFlag] = nums[i];
                    nums[i] = 0;
                }
                zeroFlag++;
            }
        }
}
}
//leetcode submit region end(Prohibit modification and deletion)


/* 思路一：
class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
            if (count > 0 && i >= (length - count)){
                nums[i] = 0;
            }
            System.out.println(count);
        }
        for (int i = length - 1; count > 0; i--) {
            System.out.println(count);
            nums[i] = 0;
            count --;
        }
    }
}
*/

/*
思路二：
class Solution {
    public void moveZeroes(int[] nums) {
      int j = 0;
        for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            if (i != j) {
                nums[j] = nums[i];
                nums[i] = 0;
            }
            j++;
        }
    }
}
}
*/
