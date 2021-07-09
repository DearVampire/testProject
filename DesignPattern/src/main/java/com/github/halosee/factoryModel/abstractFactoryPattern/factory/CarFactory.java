package com.github.halosee.factoryModel.abstractFactoryPattern.factory;

import com.github.halosee.factoryModel.abstractFactoryPattern.Cars.BlueCar;
import com.github.halosee.factoryModel.abstractFactoryPattern.Cars.Car;
import com.github.halosee.factoryModel.abstractFactoryPattern.Cars.RedCar;
import com.github.halosee.factoryModel.abstractFactoryPattern.MotoCar.MotoCar;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 11:52
 * @Version: 1.0
 */
public class CarFactory implements Factory{
    @Override
    public Car makeCar(String type) {
        Car car;
        if(type.equals("red")){
            car = new RedCar();
        }else{
            car = new BlueCar();
        }
        return car;
    }
    @Override
    public MotoCar makeMotoCar(String type) {
       return null;
    }
}
