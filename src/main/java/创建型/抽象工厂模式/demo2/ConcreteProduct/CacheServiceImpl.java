package 创建型.抽象工厂模式.demo2.ConcreteProduct;

import 创建型.抽象工厂模式.demo2.ProductA.CacheService;
import 创建型.抽象工厂模式.demo2.matter.RedisUtils;

import java.util.concurrent.TimeUnit;

public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }

}
