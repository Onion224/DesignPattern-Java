package 创建型.工厂方法模式.demo2.ConcreteProduct;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import 创建型.工厂方法模式.demo2.Product.ICommodity;
import 创建型.工厂方法模式.demo2.coupon.CouponResult;
import 创建型.工厂方法模式.demo2.coupon.CouponService;

import java.util.Map;

//优惠券
public class CouponCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId,commodityId,bizId);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new
                RuntimeException(couponResult.getInfo());
    }
}
