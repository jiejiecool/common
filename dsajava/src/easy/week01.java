package easy;


import java.util.Arrays;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2019/12/23 23:50
 */
public class week01 {
    /**
     * 找出一个数组中，偶数个数字的个数  --- 1295
     */
    public void test1295(){
        int[] arr = new int[]{555,901,482,1771};
        System.out.println(findNumbers(arr));
    }

    /**
     * String的替换？255.100.50.0 ==>255[.]100[.]50[.]0
     */
    public void test1108() {
        System.out.println(defangIPaddr("255.100.50.0"));
    }

    public String defangIPaddr(String address) {
        /*String[] split = address.split(".");
        StringBuilder sb = new StringBuilder();
        int length = split.length;
        for (int i = 0; i < length - 1; i++) {
            sb.append(split[i]).append("[.]");
        }
        sb.append(split[length - 1]);
        return sb.toString();*/
        byte[] bytes = address.getBytes();
        int length = bytes.length;
        for (int i = length -1; i >=0 ; i--) {
            //if ()
        }
        return null;
    }


    public int findNumbers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i : nums) {
            if (getDigitNums(i, 0) % 2 == 0) {
                count ++;
            }
        }

        return count;
    }

    public int getDigitNums(int number,int count) {
        if (number / 10 >= 1) {
            return getDigitNums(number/10, count + 1);
        } else {
            return count + 1;
        }
    }


}
