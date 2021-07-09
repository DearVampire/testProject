package com.github.halosee.factoryModel.abstractFactoryPattern.MotoCar;

import com.github.halosee.factoryModel.abstractFactoryPattern.Cars.Car;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 11:31
 * @Version: 1.0
 */
public class BlueMotoCar implements MotoCar {
    @Override
    public void makeMotoCar() {
        System.out.println("make a blue MotoCar");
    }}
