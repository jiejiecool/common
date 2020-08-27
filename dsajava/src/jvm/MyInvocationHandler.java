package jvm;



import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2020/2/27 9:42
 */
public class MyInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("1234");
        return 42;
    }

    @Test
    public void test12() {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Map m = (Map)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Map.class}, new MyInvocationHandler());
        m.put("1","2");
    }
}
