package 创建型.抽象工厂模式.demo1.ConcreteFactory;

import 创建型.抽象工厂模式.demo1.AbstractFactory.AbstractFactory;
import 创建型.抽象工厂模式.demo1.ConcreteProduct.ProductA2;
import 创建型.抽象工厂模式.demo1.ConcreteProduct.ProductB2;
import 创建型.抽象工厂模式.demo1.ProductA.ProductA;
import 创建型.抽象工厂模式.demo1.ProductB.ProductB;

public class ConcreteFactory2 implements AbstractFactory {
    public ProductA factoryA() {
        return new ProductA2();
    }

    public ProductB factoryB() {
        return new ProductB2();
    }
}
