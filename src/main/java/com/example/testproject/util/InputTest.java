package com.example.testproject.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/8/6 15:50
 * @Version: 1.0
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("a = "+a);
        int b = sc.nextInt();
        System.out.println("b="+b);

        System.out.println("a的二进制结果："+Integer.toBinaryString(a));
        System.out.println("b的二进制结果："+Integer.toBinaryString(b));
       int result = test(a,b);
        System.out.println("汉明输出结果是："+result);


    }

    /**
     * 汉明算法解法一
     * */
    static int hammingDistance(int x,int y){
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        /*System.out.println(String.format("%128s", Integer.toBinaryString(x)).replace(" ", "0"));
        System.out.println(String.format("%128s", Integer.toBinaryString(y)).replace(" ", "0"));*/
        while (s1.length() < 32) {
            s1 = "0" + s1;
        }
        while (s2.length() < 32) {
            s2 = "0" + s2;
        }
        char [] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();

        int result = 0;
        for (int i = 0; i < c1.length; i++){
            if (c1[i]!= c2[i]) result+=1;
        }
        return result;
    }

    /**
     * 别人的解法
     * */
    static int test(int x , int y){
        int z = x ^ y;
        System.out.println("x^y="+z);
        System.out.println("x^y的二进制结果:"+Integer.toBinaryString(z));
        int sum = 0;
        while (z>0){
            sum += z & 1;
            z = z>>1;
        }
        return sum;
    }
}
