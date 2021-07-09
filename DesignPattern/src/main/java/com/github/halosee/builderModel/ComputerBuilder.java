package com.github.halosee.builderModel;

/**
 * @Author: niuxiaowen
 * @Description:抽象建造者
 * @Date: 2021/7/7 15:44
 * @Version: 1.0
 */
public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();
    public abstract Computer getComputer();
}
