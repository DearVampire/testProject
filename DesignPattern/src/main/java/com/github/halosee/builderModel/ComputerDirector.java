package com.github.halosee.builderModel;

/**
 * @Author: niuxiaowen
 * @Description:指挥者
 * @Date: 2021/7/7 15:46
 * @Version: 1.0
 */
public class ComputerDirector {
    public void makeComputer(ComputerBuilder computerBuilder){
        computerBuilder.setDisplay();
        computerBuilder.setKeyboard();
        computerBuilder.setUsbCount();
    }
}
