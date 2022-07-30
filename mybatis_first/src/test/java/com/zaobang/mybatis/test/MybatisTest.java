package com.zaobang.mybatis.test;

import com.zaobang.mybatis.mapper.UserMapper;
import com.zaobang.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class MybatisTest {
    @Test
    public void testMybatis() throws IOException {
        //读取mybatis的核心配置文件
      InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
      //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        //通过核心 配置文件所对应的字节输入流创建工厂类SqlSessionFactory,生产SQLSession
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
//SqlSession sqlSession = sqlSessionFactory.openSession();
//创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        User userById = userMapper.getUserById();

        System.out.println(userById);
        ArrayList<User> userList = userMapper.getUserList();
        System.out.println(userList);
    }

}
