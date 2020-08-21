//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：三数之和
public class P15ThreeSum{
    public static void main(String[] args) {
        Solution solution = new P15ThreeSum().new Solution();
        // TO TEST
        List<List<Integer>> lists = solution.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    if (nums[j] + nums[k] > 0 - nums[i]) {
                        k--;
                    } else if (nums[j] + nums[k] < 0 - nums[i]) {
                        j++;
                    } else {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        if (nums[j] == nums[j+1]) j++;
                        if (nums[k] == nums[k-1]) k--;
                        j++;
                        k--;
                    }
                }
            }
        return lists;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}