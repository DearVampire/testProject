package com.github.halosee.builderModel;

/**
 * @Author: niuxiaowen
 * @Description:具体建造者
 * @Date: 2021/7/7 15:45
 * @Version: 1.0
 */
public class XiaomiComputerBuilder extends ComputerBuilder{
    private Computer computer;
    public XiaomiComputerBuilder(String cpu,String ram){
        computer = new Computer(cpu,ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("小米键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("小米显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
