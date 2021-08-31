package 创建型.工厂方法模式.demo1.ConcreteProduct;

import 创建型.工厂方法模式.demo1.Product.Fruit;

public class Grape implements Fruit {
    private boolean seedless;

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

    public void grow() {
        System.out.println("葡萄正在生长");
    }

    public void harvest() {
        System.out.println("收获葡萄");
    }

    public void planet() {
        System.out.println("栽种葡萄");
    }
}
