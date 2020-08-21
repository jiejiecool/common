package leetcode.editor.cn;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,0,8,9};
        int[] nums2 = {1,2,0,0,8,9};
        int[] nums3 = {0,0,3,4,0};
        moveZeroes(nums);
        moveZeroes(nums2);
        moveZeroes(nums3);
    }
    public  static void moveZeroes(int[] nums) {
       /* int k = 0;
        for (int i =0;i < nums.length;i++) {
            if (nums[i] != 0) {
                if (nums[k] == 0) {
                    nums[k] = nums[i];
                    nums[i] = 0;
                }
                k++;
            }
        }*/
       // 记录从右向左数第一个0
        int k = nums.length - 1;
        for (int i = nums.length -1; i >= 0; i--) {
            if (nums[i] != 0) {
                if (nums[k] == 0) {
                    nums[k] = nums[i];
                    nums[i] = 0;
                }
                k-- ;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
