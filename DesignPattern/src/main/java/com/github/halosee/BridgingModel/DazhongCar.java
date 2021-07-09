package com.github.halosee.BridgingModel;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/8 14:20
 * @Version: 1.0
 */
public class DazhongCar extends CarTypeAbstraction {
    public DazhongCar(CarPowerIImplementor carPowerIImplementor) {
        super(carPowerIImplementor);
    }
    @Override
    public void sale(String type){
        super.sale(type);
    }
}
