package com.zaobang;

import com.zaobang.bean.User;
import com.zaobang.mapper.SelectMapper;
import com.zaobang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SelectMapperTest {
    @Test
    public void getUserById(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getUserById(6));
    }
    @Test
    public void getUserList(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getUserList());
    }
    @Test
    public void getCount(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getCount());
    }
    @Test
    public void getOneUserToMap(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getOneUserToMap(8));
    }

    @Test
    public void getAllUserToMap(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getAllUserToMap());
    }
    @Test
    public void getAllUserToMapTwo(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getAllUserToMapTwo());
    }

    @Test
    public void testMoHu(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.testMoHu("李"));
    }
    @Test
    public void deletemore(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.deleteMore("1,2,3"));
    }
    @Test
    public void getAllUser(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getAllUser("t_user"));
    }
    @Test
    public void insertUser(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        SelectMapper selectMapper = sqlSesion.getMapper(SelectMapper.class);
        User user = new User(6, "da", "dw", 20, "da", "eas");
        System.out.println(user);
        selectMapper.insertUser(user);
        System.out.println(user);

    }


}
