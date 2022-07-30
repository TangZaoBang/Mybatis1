package com.zaobang;

import com.zaobang.bean.User;
import com.zaobang.mapper.ParameterMapper;
import com.zaobang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParaMeterTest {
    @Test
    public void testGetAllUser(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        ParameterMapper mapper = sqlSesion.getMapper(ParameterMapper.class);
        final List<User> allUser = mapper.getAllUser();
        allUser.forEach(user-> System.out.println(user));
    }

    @Test
    public void testGetUserByUserName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSesion();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUserName("张三55");
        System.out.println(user);
    }

    @Test
    public void testGetUserByUserNameAndPassword(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSesion();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        mapper.checkLogin("张三55","123");
    }
    @Test
    public void testGetUserByUserNameAndPassword2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSesion();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
         Map<String,Object> map=new HashMap<>();
         map.put("username","张三55");
         map.put("password",123);
        System.out.println(mapper.checkLoginByMap(map)); mapper.checkLoginByMap(map);
    }
    @Test
    public void insert(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSesion();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
User user=new User(null,"子啊","424",20,"女","wqe@");
       mapper.insertUser(user);

    }
   /* @Test
    public  void jdbc() throws Exception {
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        connection.prepareStatement()
    }*/
   /* #{} 相当于占位符
    ${}   相当于字符串拼接*/

}

