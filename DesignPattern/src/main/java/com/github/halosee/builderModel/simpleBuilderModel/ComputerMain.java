package com.github.halosee.builderModel.simpleBuilderModel;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 16:09
 * @Version: 1.0
 */
public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().cpu("联想cpu").ram("联想RAM").build();
        System.out.println("联想："+computer.toString());
    }
}
