package algo4.chap1;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2020/1/15 0:29
 */
public class Exm1_1_14 {

    public static void main(String[] args) {
        System.out.println(lg(8));
        System.out.println(lg(246));
        System.out.println(lg(2));
        System.out.println(lg(128));
        System.out.println(lg(32));
        System.out.println(lg(64));
    }
    // 写一个静态方法lg(),接收一个整形参数N，返回不大于log2N的最大整数
    public static int lg(int N) {
        int tmp = 1;
        for (int i = 0; i < N; i++) {
            if ((tmp = multi2(tmp)) >= N) {
                return i + 1;
            }
        }
        return 0;
    }

    private static int multi2(int tmp) {
        return tmp * 2;
    }
}
