package java.list;

public class List<T> {
    private Node<T> first;
    private Node<T> last;

    /**
     * 最简单的头结点插入，此方法只需维护一个属性：first。
     * 每次插入的时候，新建一个oldfirst，指向first。 然后改变first的指针至新的node，
     * 然后将node的next设置为oldfirst，即算完成了头结点的插入
     * @param node
     */
    public void addFromHead(Node<T> node){
        if (first == null) {
            first = node;
            node.setNext(null);
        } else {
            Node oldFirst = first;
            first = node;
            node.setNext(oldFirst);
        }
    }

    public static void main(String[] args) {
        List<String> list = new List<String>();
        Node<String> node1 = new Node<>();
        Node<String> node2 = new Node<>();
        Node<String> node3 = new Node<>();
        node1.setData("1");
        node1.setNext(node2);
        node2.setData("2");
        node2.setNext(node3);



    }

    /**
     * 新维护一个last节点
     */
    public void addFromLast(Node<T> node) {
        if (first == null) {
            first = node;
            last = null;
            first.setNext(null);
        } else {
            if (last == null) {
                last = node;
                first.setNext(last);
            } else {
                Node oldLast = last;
                last = node;
                oldLast.setNext(last);
            }
        }
    }

    /**
     * 单向的列表想要移除最后一个节点需要找到倒数第二个，然后将倒数第二个的节点的next设置为null
     * 这需要一个O(n)的循环
     *
     * 所以，简单链表最好还是从头结点开始删除
     * 或者维护一个双向列表
     * @return
     */
    public Node removeHead() {
        Node<T> oldFirst = this.first;


        first = first.getNext();
        return oldFirst;
    }
}