package 创建型.工厂方法模式.demo1.ConcreteProduct;

import 创建型.工厂方法模式.demo1.Product.Fruit;

public class Apple implements Fruit {
    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    public void grow() {
        System.out.println("苹果正在生长");
    }

    public void harvest() {
        System.out.println("收获苹果");
    }

    public void planet() {
        System.out.println("栽种苹果");
    }
}
