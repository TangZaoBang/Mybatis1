package com.zaobang;

import com.zaobang.bean.Dept;
import com.zaobang.bean.Emp;
import com.zaobang.bean.User;
import com.zaobang.mapper.DeptMapper;
import com.zaobang.mapper.EmpMapper;
import com.zaobang.mapper.ParameterMapper;
import com.zaobang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class EmpTest {
    @Test
    public void getEmpAndDeptById(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        EmpMapper empMapper = sqlSesion.getMapper(EmpMapper.class);
        Emp empAndDeptById = empMapper.getEmpAndDeptById(1);
        System.out.println(empAndDeptById);
    }
    @Test
    public void getEmpAndDeptByStep(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        EmpMapper empMapper = sqlSesion.getMapper(EmpMapper.class);
        Emp empByStep = empMapper.getEmpByStep(1);
        System.out.println(empByStep.geteName());
    }

    @Test
    public void getDeptEmpByIdMap(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        DeptMapper mapper = sqlSesion.getMapper(DeptMapper.class);
        Dept deptEmpById = mapper.getDeptEmpById(1);
        System.out.println(deptEmpById);
    }
    @Test
    public void getEmpListById(){
        SqlSession sqlSesion = SqlSessionUtils.getSqlSesion();
        DeptMapper mapper = sqlSesion.getMapper(DeptMapper.class);
        Dept deptByStepOne = mapper.getDeptByStepOne(1);
        System.out.println(deptByStepOne.getDeptName());
    }
}
