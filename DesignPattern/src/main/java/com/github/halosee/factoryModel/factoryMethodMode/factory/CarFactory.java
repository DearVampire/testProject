package com.github.halosee.factoryModel.factoryMethodMode.factory;

import com.github.halosee.factoryModel.factoryMethodMode.Cars.Car;

/**
 * @Author: niuxiaowen
 * @Description:提供一个用于创建对象的接口(工厂接口)，让其实现类(工厂实现类)决定实例化哪一个类(产品类)，并且由该实现类创建对应类的实例
 * @Date: 2021/7/7 11:32
 * @Version: 1.0
 */
public interface CarFactory {
    Car makeCars(String type);
}
