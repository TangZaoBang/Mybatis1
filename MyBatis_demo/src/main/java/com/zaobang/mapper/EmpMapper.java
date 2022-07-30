package com.zaobang.mapper;

import com.zaobang.bean.Dept;
import com.zaobang.bean.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    Emp getEmpAndDeptById(@Param("eid") int eid);
    Emp getEmpByStep(@Param("eid") int eid);
    Emp getEmpListById(@Param("eid") int eid);
}
