package com.github.halosee.factoryModel.abstractFactoryPattern;

import com.github.halosee.factoryModel.abstractFactoryPattern.Cars.Car;
import com.github.halosee.factoryModel.abstractFactoryPattern.MotoCar.MotoCar;
import com.github.halosee.factoryModel.abstractFactoryPattern.factory.Factory;
import com.github.halosee.factoryModel.abstractFactoryPattern.factory.FactoryProduct;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 11:56
 * @Version: 1.0
 */
public class DemoMain {
    public static void main(String[] args) {
        //消费者只知道有一个汽车工厂的产品，可以在汽车工厂产品里获取生产对应汽车的工厂
        Factory factory = FactoryProduct.getFactory("car");
        //汽车工厂获取红色汽车
        Car car = factory.makeCar("red");
        car.makeCar();
        //从汽车工厂产品里获取摩托车工厂
        Factory factory1 = FactoryProduct.getFactory("motocar");
        //摩托车工厂获取蓝色摩托车
        MotoCar motoCar = factory1.makeMotoCar("blue");
        motoCar.makeMotoCar();
    }
}
