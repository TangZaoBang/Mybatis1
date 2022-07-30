package com.zaobang.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zaobang.bean.Employee;
import com.zaobang.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
private EmployeeMapper employeeMapper;

    public PageInfo<Employee> getEmployeeList(Integer pageNum) {
        PageHelper.startPage(pageNum,1);
        List<Employee> employeeList = employeeMapper.getEmployeeList();
        PageInfo pageInfo = new PageInfo<Employee>(employeeList,1);
        return pageInfo;
    }
    public List<Employee> getEmployeeList2() {

        List<Employee> employeeList = employeeMapper.getEmployeeList();
        return employeeList;
    }

    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        PageHelper.startPage(pageNum,3);
        List<Employee> list = employeeMapper.getAllEmployee();
        PageInfo<Employee> page = new PageInfo<Employee>(list, 5);
        return page;
    }

}
