package algo4.chap1;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2020/2/4 22:48
 */
public class WightedQuickUnionUF {
    public int []arr;
    public int []size;

    WightedQuickUnionUF(int n) {
        arr = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            size[i] = 1;
        }
    }
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public int root(int p) {
        while (arr[p] != p) {
            p = arr[p];
        }
        return p;
    }

    public void connect(int p, int q) {
        // p权重 小于 右边，则把root节点挂载在q的root下面
        if (size[p] < size[q]) {
            arr[p] = root(q);
            size[q] = size[q] + size[p];
        } else {
            arr[q] = root(p);
            size[p] = size[q] + size[p];
        }
    }
}
