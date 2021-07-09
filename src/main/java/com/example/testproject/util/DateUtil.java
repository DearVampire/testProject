package com.example.testproject.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/9 9:49
 * @Version: 1.0
 */
public class DateUtil {
    public static void main(String[] args) {
        //这样创建date就是系统当前时间，但是可读性不好
        Date date = new Date();
        System.out.println("日期对象直接打印时间："+date);
        //创建日期格式化对象，转换日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        System.out.println("时间转化对象格式化时间："+simpleDateFormat.format(date));

        //Date类在开发中主要用于日期的计算，并非存储
        //Date类是存储距离一个历史时间的毫秒数（1970年1月1日，0点0分0秒）
        System.out.println("当前时间的毫秒数："+date.getTime());

        //字符串转换为日期
        //String和Date之间的转换都必须通过SimpleDateFormat实现
        String s = "20210716";
        //
    }
}
