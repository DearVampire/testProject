package com.github.halosee.BridgingModel;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/8 14:22
 * @Version: 1.0
 */
public class DemoClient {
    public static void main(String[] args) {

        //创建具体的实现对象,新能源汽车
        CarPowerIImplementor carPowerIImplementor = new NewCar();
        //创建一个扩充类对象，吉利汽车
        CarTypeAbstraction carTypeAbstraction = new JiliCar(carPowerIImplementor);
        carTypeAbstraction.sale("吉利");

        //创建一个扩充类对象，思域汽车
        carTypeAbstraction = new SiyuCar(carPowerIImplementor);
        carTypeAbstraction.sale("思域");

        carTypeAbstraction = new DazhongCar(carPowerIImplementor);
        carTypeAbstraction.sale("大众");

        //创建具体的实现对象,传统能源汽车
        carPowerIImplementor = new OlderCar();
        //创建一个扩充类对象，吉利汽车
        carTypeAbstraction = new JiliCar(carPowerIImplementor);
        carTypeAbstraction.sale("吉利");

        //创建一个扩充类对象，思域汽车
        carTypeAbstraction = new SiyuCar(carPowerIImplementor);
        carTypeAbstraction.sale("思域");

        carTypeAbstraction = new DazhongCar(carPowerIImplementor);
        carTypeAbstraction.sale("大众");


        //创建具体的实现对象,混合能源汽车
        carPowerIImplementor = new HunheCar();
        //创建一个扩充类对象，吉利汽车
        carTypeAbstraction = new JiliCar(carPowerIImplementor);
        carTypeAbstraction.sale("吉利");

        //创建一个扩充类对象，思域汽车
        carTypeAbstraction = new SiyuCar(carPowerIImplementor);
        carTypeAbstraction.sale("思域");

        carTypeAbstraction = new DazhongCar(carPowerIImplementor);
        carTypeAbstraction.sale("大众");

    }
}
