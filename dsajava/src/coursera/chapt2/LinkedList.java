package coursera.chapt2;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/7/23 22:39
 *
 * add / remove
 */
public class LinkedList<T> {


    Node<T> first;

    /**
     * add this node to first;
     * @param node
     */
    public void add(Node<T> node) {
        if (first == null) {
            first = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    /**
     * default remove first
     */
    public Node<T> remove() {
        if (first == null) {
            throw new UnsupportedOperationException();
        }

        Node<T> originFirstNode = first;
        first = first.next;
        return originFirstNode;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        Node node1 = new Node();
        node1.data = "1";
        list.add(node1);
        Node node2 = new Node();
        node2.data = "2";
        list.add(node2);
        Node node3 = new Node();
        node3.data = "3";
        list.add(node3);

        System.out.println(list.first.data);
        System.out.println(list.first.next.data);
        System.out.println(list.first.next.next.data);
    }
}
