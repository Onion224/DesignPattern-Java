package 创建型.工厂方法模式.demo1.Client;

import 创建型.工厂方法模式.demo1.ConcreteCreator.AppleGardener;
import 创建型.工厂方法模式.demo1.ConcreteCreator.GrapeGardener;
import 创建型.工厂方法模式.demo1.Creator.FruitGardener;
import 创建型.工厂方法模式.demo1.Product.Fruit;

public class Client {
    public static void main(String[] args) {
        //苹果园丁工厂
        FruitGardener fruitGardener = new AppleGardener();
        //通过通常生产苹果
        Fruit apple = fruitGardener.factory();

        apple.planet();
        apple.grow();
        apple.harvest();

        //葡萄园丁工厂
        fruitGardener = new GrapeGardener();
        Fruit grape = fruitGardener.factory();

        grape.planet();
        grape.grow();
        grape.harvest();
    }
}
