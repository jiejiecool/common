package coursera.chapt2;

/**
 * @Author: jiejiecool
 * @Description: basic api of stack
 * @Date: create in 2020/7/23 0:22
 *
 *
 * basic api of stack: push, pop, isEmpty(), size()
 */
public interface Stack<T> {

    /**
     * push item to lastest place
     * @param item
     */
    void push(T item);

    /**
     *
     * @return the last item
     */
    T pop();

    /**
     * check is empty
     * @return return true if is empty
     */
    boolean isEmpty();

    /**
     *
     * @return the size of this stack
     */
    int size();
}
