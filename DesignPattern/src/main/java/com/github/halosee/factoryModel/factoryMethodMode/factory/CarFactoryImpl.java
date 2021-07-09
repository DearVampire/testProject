package com.github.halosee.factoryModel.factoryMethodMode.factory;

import com.github.halosee.factoryModel.factoryMethodMode.Cars.BlueCar;
import com.github.halosee.factoryModel.factoryMethodMode.Cars.Car;
import com.github.halosee.factoryModel.factoryMethodMode.Cars.RedCar;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 11:33
 * @Version: 1.0
 */
public class CarFactoryImpl implements CarFactory {
    @Override
    public Car makeCars(String type) {
        Car car;
        if(type.equals("red")){
            car = new RedCar();
        }else{
            car = new BlueCar();
        }
        return car;
    }
}
