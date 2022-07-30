package com.zaobang.mapper;

import com.zaobang.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EmployeeMapper {
    List<Employee> getEmployeeList();

    List<Employee> getAllEmployee();
}
