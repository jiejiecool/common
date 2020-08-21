package algo4.chap3;

public class HeapSort {
    public static void main(String[] args) {

    }

    private static void heapify(int[] arr, int i) {
        int left = 2 * i;
        int right = 2 * i +1;
        int largest;
        if (left < arr.length && arr[left] >= arr[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right < arr.length && arr[right] >= arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            heapify(arr, largest);
        }
    }

    private static void build_heap(int[] arr) {
        for (int i = ((arr.length / 2) - 1); i >=0; i--) {
            heapify(arr, i);
        }
    }

}
