package com.github.halosee.BridgingModel;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/8 14:21
 * @Version: 1.0
 */
public class NewCar implements CarPowerIImplementor{
    @Override
    public void saleCar(String type) {
        System.out.println("卖出一辆新能源"+type+"汽车");
    }
}
