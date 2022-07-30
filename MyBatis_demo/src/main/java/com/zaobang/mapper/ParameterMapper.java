package com.zaobang.mapper;

import com.zaobang.bean.User;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    /**
     * 查询所有员工信息
     */
    int insertUser(User user);
    List<User> getAllUser();

    User getUserByUserName(String username);

    //验证登录
    User checkLogin(String username , String password);
    User checkLoginByMap(Map<String,Object>map);

}
