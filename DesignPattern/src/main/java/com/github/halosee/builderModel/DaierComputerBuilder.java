package com.github.halosee.builderModel;

/**
 * @Author: niuxiaowen
 * @Description:具体建造者
 * @Date: 2021/7/7 15:44
 * @Version: 1.0
 */
public class DaierComputerBuilder extends ComputerBuilder{
    private Computer computer;
    public DaierComputerBuilder(String cpu,String ram){
        computer = new Computer(cpu,ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(3);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("戴尔键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("戴尔显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
