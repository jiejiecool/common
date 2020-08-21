package algo4.chap2;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2020/2/25 9:04
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,5,2,4,8,3,9};
        sort(arr,0,arr.length-1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low == high) return;
        int middle = (low + high) / 2;
        sort(arr, low, middle);
        sort(arr, middle+1, high);
        merge(arr, low, middle, high);
    }

    private static void merge(int[] arr, int low, int middle, int high) {
    }


}
