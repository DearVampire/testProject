package com.github.halosee.factoryModel.abstractFactoryPattern.factory;

import com.github.halosee.factoryModel.abstractFactoryPattern.Cars.Car;
import com.github.halosee.factoryModel.abstractFactoryPattern.MotoCar.MotoCar;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 11:51
 * @Version: 1.0
 */
public interface Factory {
    Car makeCar(String type);
    MotoCar makeMotoCar(String type);
}
