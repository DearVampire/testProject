package com.github.halosee.factoryModel.factoryMethodMode;

import com.github.halosee.factoryModel.factoryMethodMode.Cars.Car;
import com.github.halosee.factoryModel.factoryMethodMode.factory.CarFactory;
import com.github.halosee.factoryModel.factoryMethodMode.factory.CarFactoryImpl;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 11:35
 * @Version: 1.0
 */
public class CarViMain {
    public static void main(String[] args) {
        //消费者只知道有一个汽车工厂
        CarFactory carFactory = new CarFactoryImpl();
        //我需要一辆car
        Car car;
        //我需要一辆什么颜色的car，具体car如何制作跟我消费者无任何关系，实现解耦
        car = carFactory.makeCars("red");
        car.makeCar();
        car = carFactory.makeCars("blue");
        car.makeCar();
    }
}
