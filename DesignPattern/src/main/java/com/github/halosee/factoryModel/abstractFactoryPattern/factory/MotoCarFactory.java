package com.github.halosee.factoryModel.abstractFactoryPattern.factory;

import com.github.halosee.factoryModel.abstractFactoryPattern.Cars.Car;
import com.github.halosee.factoryModel.abstractFactoryPattern.MotoCar.BlueMotoCar;
import com.github.halosee.factoryModel.abstractFactoryPattern.MotoCar.MotoCar;
import com.github.halosee.factoryModel.abstractFactoryPattern.MotoCar.RedMotoCar;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 11:55
 * @Version: 1.0
 */
public class MotoCarFactory implements Factory{
    @Override
    public Car makeCar(String type) {
        return null;
    }
    @Override
    public MotoCar makeMotoCar(String type) {
        MotoCar motoCar;
        if(type.equals("red")){
            motoCar = new RedMotoCar();
        }else{
            motoCar = new BlueMotoCar();
        }
        return motoCar;
    }
}
