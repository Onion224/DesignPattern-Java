package 创建型.抽象工厂模式.demo2;

import 创建型.抽象工厂模式.demo2.CacheService;
import 创建型.抽象工厂模式.demo2.JDKProxy;
import 创建型.抽象工厂模式.demo2.EGMCacheAdapter;
import 创建型.抽象工厂模式.demo2.IIRCacheAdapter;
import 创建型.抽象工厂模式.demo2.CacheServiceImpl;
import org.junit.Test;

public class Client {

    @Test
    public void test_CacheService2() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
