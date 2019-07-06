package demo.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactoy implements InvocationHandler {

    private Object obj;

    public Object bind(Object obj){
        this.obj =obj;

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Integer in = (Integer) args[0];
        in =in*2;
        Object invoke = method.invoke(obj, in);
        return invoke;
    }
}
