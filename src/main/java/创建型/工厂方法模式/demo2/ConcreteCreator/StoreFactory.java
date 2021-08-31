package 创建型.工厂方法模式.demo2.ConcreteCreator;

import 创建型.工厂方法模式.demo2.ConcreteProduct.CardCommodityService;
import 创建型.工厂方法模式.demo2.ConcreteProduct.CouponCommodityService;
import 创建型.工厂方法模式.demo2.ConcreteProduct.GoodsCommodityService;
import 创建型.工厂方法模式.demo2.Product.ICommodity;

public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}