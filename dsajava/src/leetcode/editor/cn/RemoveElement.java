package leetcode.editor.cn;

//Given an array nums and a value val, remove all instances of that value in-pla
//ce and return the new length. 
//
// Do not allocate extra space for another array, you must do this by modifying 
//the input array in-place with O(1) extra memory. 
//
// The order of elements can be changed. It doesn't matter what you leave beyond
// the new length. 
//
// Example 1: 
//
// 
//Given nums = [3,2,2,3], val = 3,
//
//Your function should return length = 2, with the first two elements of nums be
//ing 2.
//
//It doesn't matter what you leave beyond the returned length.
// 
//
// Example 2: 
//
// 
//Given nums = [0,1,2,2,3,0,4,2], val = 2,
//
//Your function should return length = 5, with the first five elements of nums c
//ontaining 0, 1, 3, 0, and 4.
//
//Note that the order of those five elements can be arbitrary.
//
//It doesn't matter what values are set beyond the returned length. 
//
// Clarification: 
//
// Confused why the returned value is an integer but your answer is an array? 
//
// Note that the input array is passed in by reference, which means modification
// to the input array will be known to the caller as well. 
//
// Internally you can think of this: 
//
// 
//// nums is passed in by reference. (i.e., without making a copy)
//int len = removeElement(nums, val);
//
//// any modification to nums in your function would be known by the caller.
//// using the length returned by your function, it prints the first len element
//s.
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//} Related Topics 数组 双指针 
// 👍 633 👎 0


import java.util.Arrays;

public class RemoveElement{
	public static void main(String[] args) {
		Solution solution = new RemoveElement().new Solution();
		//int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
		int[] arr = new int[]{3,2,2,3};
		System.out.println(solution.removeElement(arr, 3));
		System.out.println(Arrays.toString(arr));
	}
	
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	/**
	 * 快慢指针，快指针从后往前扫描，慢指针代表当前是指定值的最前面的数据
	 *
	 * @param nums
	 * @param val
	 * @return
	 */
    public int removeElement(int[] nums, int val) {
    	int right = nums.length-1;

    	for (int i = right; i >=0; i--) {
    		if (nums[i] == val) {
    			int temp = nums[right];
    			nums[right] = val;
    			nums[i] = temp;
				System.out.println("right:"+right);
    			right--;
			}
		}
		return right + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
