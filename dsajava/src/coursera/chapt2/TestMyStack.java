package coursera.chapt2;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/7/24 9:43
 */
public class TestMyStack {

    public static void main(String[] args) {
        AbstractStack<String> stack = new AbstractStack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println("stack's size is "+stack.size());


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("stack's size is "+stack.size());

        System.out.println("stack is empty ? " + stack.isEmpty());
    }


}
