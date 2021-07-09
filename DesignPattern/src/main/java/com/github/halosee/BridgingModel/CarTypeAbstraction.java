package com.github.halosee.BridgingModel;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/8 14:18
 * @Version: 1.0
 */
public abstract class CarTypeAbstraction {
    CarPowerIImplementor carPowerIImplementor;

    public CarTypeAbstraction(CarPowerIImplementor carPowerIImplementor){
        this.carPowerIImplementor = carPowerIImplementor;
    }
    public void sale(String type){
        carPowerIImplementor.saleCar(type);
    }
}
