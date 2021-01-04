package threadlocal;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/9/7 12:15
 */
public class TestInheritableThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> t = new ThreadLocal<>();
        t.set("1234");

        Thread t1 = new Thread(() -> {
            System.out.println("3");
            System.out.println(t.get());
        });


        InheritableThreadLocal<String> t2 = new InheritableThreadLocal<>();
        t2.set("1234");

        Thread t3 = new Thread(() -> {
            System.out.println("3---------------");
            System.out.println("0---------"+t2.get());
        });

        t1.start();
        t3.start();


    }
}
