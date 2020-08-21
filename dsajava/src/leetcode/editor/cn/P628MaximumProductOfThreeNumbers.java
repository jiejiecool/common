//给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。 
//
// 示例 1: 
//
// 
//输入: [1,2,3]
//输出: 6
// 
//
// 示例 2: 
//
// 
//输入: [1,2,3,4]
//输出: 24
// 
//
// 注意: 
//
// 
// 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。 
// 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。 
// 
// Related Topics 数组 数学


package leetcode.editor.cn;
//Java：三个数的最大乘积
public class P628MaximumProductOfThreeNumbers{
    public static void main(String[] args) {
        Solution solution = new P628MaximumProductOfThreeNumbers().new Solution();
        // TO TEST
        System.out.println(solution.maximumProduct(new int[]{1, 2, 3}));
        System.out.println(solution.maximumProduct(new int[]{1, 2, 3, 4}));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumProduct(int[] nums) {
        int a = -1001;
        int b = -1002;
        int c = -1003;
        int tmpa ,tmpb;
        int d = 1001;
        int e = 1002;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= a) {
                tmpa = a;
                tmpb = b;
                a = nums[i];
                b = tmpa;
                c = tmpb;
            } else if (nums[i] >= b) {
                tmpb = b;
                b = nums[i];
                c = tmpb;
            } else if (nums[i] >= c) {
                c = nums[i];
            }
        }
        return a * b * c;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}