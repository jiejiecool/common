package easy;


/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2020/2/12 21:33
 */
public class Class1342 {
    public int numberOfSteps (int num) {
        int divideNum = 0;
        int subNum = 0;
        while (num / 2 != 0) {
            if (num % 2 != 0) {
                subNum ++;
            }
            num = num /2;
            divideNum ++;
        }
        return divideNum + subNum + 1;
    }

    public void test() {
        System.out.println(this.numberOfSteps(14));
        System.out.println(this.numberOfSteps(8));
        System.out.println(this.numberOfSteps(123));
    }

    public static void main(String[] args) {
        System.out.println(3 & 1);
        System.out.println(2 & 1);
        System.out.println(4 & 1);
        System.out.println(1 & 1);
        System.out.println(0 & 1);
    }
}
