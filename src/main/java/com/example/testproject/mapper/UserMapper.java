package com.example.testproject.mapper;

import com.example.testproject.entity.User;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.ResultSetType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auth：niuxiaowen
 * @Desc:
 * @Date: 2021/6/3
 */

@Repository
public interface UserMapper {
    int insert(List<User> user);

    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = Integer.MIN_VALUE)
    @Select("select * from user_one")
    List<User> selectAllUserOne();

    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = Integer.MIN_VALUE)
    @Select("select * from user_two")
    List<User> selectAllUserTwo();
}
