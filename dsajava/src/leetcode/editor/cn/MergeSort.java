package leetcode.editor.cn;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {2,5,7,8,1,3,4,6};
        int[] resultNums = mergeAndSort(nums);

    }

    private static int[] mergeAndSort(int[] nums) {
        if (nums.length > 1) {
            //mergeAndSort(nums)
        }
        return nums;
    }

    //肯定是使用两个数组归并然后返回一个数组
    static int[]  sort(int[] nums1, int[] nums2) {
        int[] resutNums = new int[nums1.length + nums2.length];
        int k = 0;
        int j = 0;//第二个数组的指针
        int i = 0;//第一个数组的指针
        for (; i < nums1.length; ) {
            if (nums1[i] <= nums2[j]) {
                resutNums[k++] = nums1[i++];
            } else {
                resutNums[k++] = nums2[j++];
            }
        }

      for (; j < nums2.length; ) {
          resutNums[k++] = nums2[j++];
      }
        return resutNums;
    }
}
