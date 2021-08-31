package 创建型.工厂方法模式.demo1.ConcreteCreator;

import 创建型.工厂方法模式.demo1.ConcreteProduct.Grape;
import 创建型.工厂方法模式.demo1.Creator.FruitGardener;
import 创建型.工厂方法模式.demo1.Product.Fruit;

public class GrapeGardener implements FruitGardener {
    public Fruit factory() {
        return new Grape();
    }
}
