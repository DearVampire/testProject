package com.github.halosee.builderModel;

/**
 * @Author: niuxiaowen
 * @Description:使用者
 * @Date: 2021/7/7 15:47
 * @Version: 1.0
 */
public class BuildMain {
    public static void main(String[] args) {
        //获取指挥者
        ComputerDirector computerDirector  = new ComputerDirector();
        //获取具体建造者1
        ComputerBuilder xiaomiComputerBuilder = new XiaomiComputerBuilder("小米cpu","小米ram");
        computerDirector.makeComputer(xiaomiComputerBuilder);
        //通过具体构建者获取商品
        Computer xiaomi = xiaomiComputerBuilder.getComputer();
        System.out.println("小米："+xiaomi.toString());

        //获取具体构建者2
        ComputerBuilder daierComputerBuilder = new DaierComputerBuilder("戴尔cpu","戴尔ram");
        computerDirector.makeComputer(daierComputerBuilder);
        //通过具体构建者获取商品
        Computer daier = daierComputerBuilder.getComputer();
        System.out.println("戴尔："+daier.toString());
    }
}
