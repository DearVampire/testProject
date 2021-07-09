package com.example.testproject.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auth：niuxiaowen
 * @Desc:
 * @Date: 2021/6/3
 */

@Data
public class User implements Serializable {

    private int id;

    private int age;

    private String name;

    private String sex;


}
