package algo4.chap2;


import org.junit.jupiter.api.Test;

/**
 * shell - sort
 * @Author: jiejiecool
 * @Description:
 * @Date: 2020/2/19 0:18
 */
public class ShellSort {

    public void sort(int[] arr) {
        int h = 0;
        int N = arr.length;
        while( h < N) h = h * 3 + 1;

        while ( h > 0) {
            for (int i = h; i < N; i++) {
                for (int j = i; j-h > 0 && less(arr[j], arr[j-h]); j -= h)
                    exch(arr, j, j-h);
            }
            h /= 3;
        }

    }
    public boolean less(int a, int b) {
        return a < b;
    }

    public void exch(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    @Test
    public void testShellSort() {
        int[] arr = {1,9,5,3,8,13};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
