package algo4.chap1;

/**
 * @Author: jiejiecool
 * @Description: QUICK FIND 算法 时间复杂度 n*n
 * @Date: 2020/2/4 22:47
 */
public class QuickFindUF {
    public int[] arr;
    public int count;

    QuickFindUF(int[] arr) {
        this.arr = arr;
    }

    private void validate(int p) {
        int length = arr.length;
        if (p < 0 || p > length) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (length - 1));
        }
    }
    public int find(int p) {
        return arr[p];
    }

    public boolean connected(int p, int q) {
        return arr[p] == arr[q];
    }

    public void union(int p, int q) {
        if (find(0) != find(q)) {
            for (int i = 0; i < arr.length; i++) {
                this.count++;
                if (find(i) == find(1)) {
                    arr[i] = find(p);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        WightedQuickUnionUF uf = new WightedQuickUnionUF(10);
        uf.connect(9, 0);
        uf.connect(3, 4);
        uf.connect(5, 8);
        uf.connect(7, 2);
        uf.connect(2, 1);
        uf.connect(5, 7);
        uf.connect(0, 3);
        uf.connect(4, 2);

        for (int i = 0; i < uf.arr.length; i++) {
            System.out.print(uf.arr[i] + " ");
            //System.out.print(uf.size[i] + " ");
        }

        System.out.println("");
    }
}
