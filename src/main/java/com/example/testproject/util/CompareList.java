package com.example.testproject.util;

import com.example.testproject.entity.User;
import com.example.testproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Auth：niuxiaowen
 * @Desc:
 * @Date: 2021/6/3
 */
@Component
public class CompareList {
    @Autowired
    UserMapper userMapper;

    public void CompareUserList(){
        long sqlStartTime = System.currentTimeMillis();
        List<User> listOne = new ArrayList<>();
        listOne = userMapper.selectAllUserOne();
        List<User> listTwo = new ArrayList<>();
        listTwo = userMapper.selectAllUserTwo();
        long sqlEndTime = System.currentTimeMillis();

        System.out.println("两个10w数据量的表sql执行时常"+((sqlStartTime-sqlEndTime)/1000)+"s  ------------------------");

        long compareStartTime = System.currentTimeMillis();
        List<User> resultList = new ArrayList<User>();
        LinkedList<User> result=  new LinkedList<User>(listOne);
        HashSet<User> othHash = new HashSet<User>(listTwo);
        Iterator<User> iter = result.iterator();
        while(iter.hasNext()){
            if(othHash.contains(iter.next())){
                iter.remove();
            }
        }
        resultList = new ArrayList<User>(result);
        listOne.clear();
        List<User> finalListOne = listOne;
        resultList.forEach(o-> finalListOne.add(o));
        System.out.println(listOne);
        long compareEndTime = System.currentTimeMillis();

        System.out.println("10w数据集合得出差集"+((compareStartTime-compareEndTime)/1000)+"s   ------------------------");
    }
}
