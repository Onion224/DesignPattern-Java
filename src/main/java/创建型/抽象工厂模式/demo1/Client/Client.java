package 创建型.抽象工厂模式.demo1.Client;

import org.junit.Test;
import 创建型.抽象工厂模式.demo1.AbstractFactory.AbstractFactory;
import 创建型.抽象工厂模式.demo1.ConcreteFactory.ConcreteFactory1;
import 创建型.抽象工厂模式.demo1.ConcreteFactory.ConcreteFactory2;
import 创建型.抽象工厂模式.demo1.ConcreteProduct.ProductA1;
import 创建型.抽象工厂模式.demo1.ConcreteProduct.ProductA2;
import 创建型.抽象工厂模式.demo1.ConcreteProduct.ProductB1;
import 创建型.抽象工厂模式.demo1.ConcreteProduct.ProductB2;
import 创建型.抽象工厂模式.demo1.ProductA.ProductA;
import 创建型.抽象工厂模式.demo1.ProductB.ProductB;

public class Client {
    public static void main(String[] args) {
        //定义两个工厂
        AbstractFactory Factory1 = new ConcreteFactory1();
        AbstractFactory Factory2 = new ConcreteFactory2();
        //生产等级为1的产品A
        ProductA a1 = Factory1.factoryA();
        //生产等级为2的产品A
        ProductA a2 = Factory2.factoryA();
        //生产等级为1的产品B
        ProductB b1 = Factory1.factoryB();
        //生产等级为2的产品B
        ProductB b2 = Factory2.factoryB();
        //业务处理
        a1.method1();
        a2.method1();
        b1.method1();
        b2.method1();
    }
}
