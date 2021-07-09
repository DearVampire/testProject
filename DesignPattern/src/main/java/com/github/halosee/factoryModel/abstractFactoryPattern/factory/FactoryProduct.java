package com.github.halosee.factoryModel.abstractFactoryPattern.factory;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 11:55
 * @Version: 1.0
 */
public class FactoryProduct {
    public static Factory getFactory(String type){
        Factory factory;
        if("car".equals(type)){
            factory = new CarFactory();
        }else{
            factory = new MotoCarFactory();
        }
        return factory;
    }
}
