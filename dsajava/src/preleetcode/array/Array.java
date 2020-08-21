package preleetcode.array;

import java.util.Arrays;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/7/24 10:56
 */
public class Array {
    int[] arr;
    int size;

    public Array(int[] arr) {
        this.arr = arr;
    }

    /**
     * 扩容
     */
    public void reSize() {
        System.out.println("====== start resize, origin length :" + arr.length);
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        System.out.println("===== end length is :" + arr.length);
    }

    public void insertEnd(int element) {
        if (size == arr.length) {
            reSize();
        }
        arr[size++] = element;
    }

    /**
     * 所有当前节点后移一位
     * @param element 元素内容
     */
    public void insertStart(int element) {
        if (size == arr.length) {
            reSize();
        }
        for (int i = size - 1; i >= 0 ; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = element;
        size ++;
    }


    /**
     * 任意节点处插入，并且从此节点以后都开始后移一位
     * @param element
     * @param slot
     */
    public void insertAnySlot(int element, int slot) {
        if (size == arr.length) {
            reSize();
        }

        for (int i = size - 1; i >= slot; i--) {
            arr[i+1] = arr[i];
        }
        arr[slot] = element;
        size++;
    }

    @Override
    public String toString() {
        return "Array{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        // test insertEnd
      /*  int arr[] = new int[1];
        Array array = new Array(arr);
        array.insertEnd(1);
        array.insertEnd(2);
        array.insertEnd(3);
        array.insertEnd(4);
        array.insertEnd(5);

        System.out.println(array.toString());*/


        // test inserStart
       /* int arr1[] = new int[1];
        Array array1 = new Array(arr1);
        array1.insertStart(1);
        array1.insertStart(2);
        array1.insertStart(3);
        array1.insertStart(4);
        array1.insertStart(5);

        System.out.println(array1.toString());*/

        // test insertslot 2;
        int[] arr1 = new int[1];
        Array array1 = new Array(arr1);
        array1.insertStart(1);
        array1.insertStart(2);
        array1.insertStart(3);
        array1.insertAnySlot(4,2);
        array1.insertAnySlot(5,2);

        System.out.println(array1.toString());
    }
}
