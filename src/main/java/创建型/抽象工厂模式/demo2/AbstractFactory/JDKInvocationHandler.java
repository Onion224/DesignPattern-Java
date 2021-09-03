package 创建型.抽象工厂模式.demo2.AbstractFactory;

import 创建型.抽象工厂模式.demo2.AbstractFactory.ICacheAdapter;
import 创建型.抽象工厂模式.demo2.Utils.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;
    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(),
                ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }
}