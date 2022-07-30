package com.zaobang.mybatis.mapper;

import com.zaobang.mybatis.pojo.User;

import java.util.ArrayList;

public interface UserMapper{
    //添加
    int insertUser();
    //修改
    int updateUser();
    //删除
    int deleteUser();
    //查询
    User getUserById();
    ArrayList<User> getUserList();
}
