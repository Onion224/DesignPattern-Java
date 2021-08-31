package 创建型.工厂方法模式.demo1.ConcreteCreator;

import 创建型.工厂方法模式.demo1.ConcreteProduct.Apple;
import 创建型.工厂方法模式.demo1.Creator.FruitGardener;
import 创建型.工厂方法模式.demo1.Product.Fruit;

public class AppleGardener implements FruitGardener {

    public Fruit factory() {
        return new Apple();
    }
}
