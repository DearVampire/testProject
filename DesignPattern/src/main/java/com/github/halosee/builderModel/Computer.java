package com.github.halosee.builderModel;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 15:42
 * @Version: 1.0
 */
public class Computer {
    /**必传参数*/
    private String cpu;
    private String ram;
    /**以下三个为可选参数*/
    private int usbCount;
    private String keyboard;
    private String display;
    /**
     * @Description 必选参数构造函数
     */
    public Computer(String cpu,String ram){
        this.cpu = cpu;
        this.ram = ram;
    }
    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
