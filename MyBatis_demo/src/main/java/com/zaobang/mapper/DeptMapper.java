package com.zaobang.mapper;

import com.zaobang.bean.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptByStep(@Param("did") Integer did);
    Dept getDeptEmpById(@Param("did") Integer did);
    Dept getDeptByStepOne(@Param("did") Integer did);
}
