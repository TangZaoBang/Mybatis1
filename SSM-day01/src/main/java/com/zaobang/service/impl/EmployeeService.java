package com.zaobang.service.impl;

import com.github.pagehelper.PageInfo;
import com.zaobang.bean.Employee;

import java.util.List;

public interface EmployeeService {
    PageInfo<Employee> getEmployeeList(Integer pageNum);
    List<Employee> getEmployeeList2();

    List<Employee> getAllEmployee();

    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
