package 创建型.抽象工厂模式.demo1.AbstractFactory;

import 创建型.抽象工厂模式.demo1.ProductA.ProductA;
import 创建型.抽象工厂模式.demo1.ProductB.ProductB;

public interface AbstractFactory {
    //创建产品A
    public ProductA factoryA();
    //创建产品B
    public ProductB factoryB();
}
