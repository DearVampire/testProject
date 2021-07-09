package com.example.testproject.util;

import com.example.testproject.entity.User;
import com.example.testproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Auth：niuxiaowen
 * @Desc:
 * @Date: 2021/6/3
 */

@Component
public class sqlTest {

    @Autowired
    UserMapper userMapper;


    public String testSql(){
        List<User> userList = new ArrayList<>();

        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            User user = new User();
            user.setName("name" + i);
            if(random.nextBoolean() == true) user.setSex("男");
            else user.setSex("女");
            user.setAge(random.nextInt(80));
            userList.add(user);
        }
        userMapper.insert(userList);
        long end = System.currentTimeMillis();
        System.out.println("---------------" + (start - end) + "---------------");
        return Long.toString(start-end);
    }


}
