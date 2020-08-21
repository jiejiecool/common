package algo4.chap1;


/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2020/1/6 19:49
 */
public class Exm1_1_13 {
    /**
     * 本质就是a[j][i] = b[i][j]
     */
    public void test() {
        int[][] a = {{1,2,3,4,5}, {2,4,5,6,10}};
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }

        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
