package com.example.testproject.controller;

import com.example.testproject.util.CompareList;
import com.example.testproject.util.sqlTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auth：niuxiaowen
 * @Desc:
 * @Date: 2021/6/3
 */

@Slf4j
@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    com.example.testproject.util.sqlTest sqlTest;

    @Autowired
    CompareList compareList;

    @RequestMapping(value = "/add")
    public String add(){
         return sqlTest.testSql();
    }

    @RequestMapping(value = "/select")
    public void selectUser(){
        compareList.CompareUserList();
    }


}
