package 创建型.抽象工厂模式.demo1.ConcreteProduct;

import 创建型.抽象工厂模式.demo1.ProductA.ProductA;

public class ProductA1 implements ProductA {
    public void method1() {
        System.out.println("产品A1的方法1");
    }

    public void method2() {
        System.out.println("产品A1的方法2");
    }
}
