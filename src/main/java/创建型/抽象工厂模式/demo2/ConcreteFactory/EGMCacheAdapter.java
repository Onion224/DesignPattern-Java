package 创建型.抽象工厂模式.demo2.ConcreteFactory;

import 创建型.抽象工厂模式.demo2.AbstractFactory.ICacheAdapter;
import 创建型.抽象工厂模式.demo2.matter.EGM;

import java.util.concurrent.TimeUnit;

public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();
    public String get(String key) {
        return egm.gain(key);
    }
    public void set(String key, String value) {
        egm.set(key, value);
    }
    public void set(String key, String value, long timeout, TimeUnit
            timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }
    public void del(String key) {
        egm.delete(key);
    }
}
