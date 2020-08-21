package thread;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/8/3 10:04
 */
public class MyThread {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("t1 ... created");
            System.out.println("new thread group is :" +Thread.currentThread().getThreadGroup());
        };

        Thread t1 = new Thread(r1);

        System.out.println(Thread.currentThread().getThreadGroup());
        t1.start();
    }
}
