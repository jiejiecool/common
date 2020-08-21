package coursera.chapt2;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/7/24 9:35
 */
public class AbstractStack<T> implements Stack<T>{

    private LinkedList<T> linkedList = new LinkedList<>();
    private int size;

    @Override
    public void push(T item) {
        Node<T> node = new Node<>();
        node.data = item;
        linkedList.add(node);
        size++;
    }

    @Override
    public T pop() {
        Node<T> node = linkedList.remove();
        size --;
        return node.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
