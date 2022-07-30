package com.zaobang.mapper;

import com.zaobang.bean.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
/**
 * 根据用户id查询用户信息
 * @param id
 * @return
 */
User getUserById(@Param("ds") int id);
List<User> getUserList();
Integer getCount();
Map<String,Object> getOneUserToMap(@Param("id") Integer id);
List<Map<String,Object>> getAllUserToMap();
@MapKey("id")//设置某个字段为键 要是唯一
    Map<String,Object> getAllUserToMapTwo();
List<User> testMoHu(@Param("mohu") String mohu);
int deleteMore(@Param("ids") String ids);
List<User> getAllUser(@Param("tableName") String tableName);
    int insertUser(User user);

}

