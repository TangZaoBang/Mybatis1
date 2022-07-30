package com.zaobang.controller;

import com.github.pagehelper.PageInfo;
import com.zaobang.bean.Employee;
import com.zaobang.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *  查询所有的员工信息 /employee  get
 *  查询所有的员工信息byId /employee/1  get
 *  跳转到添加页面 /to/add  get
 *  添加员工信息 /employee  post
 *  修改员工信息  /employee   put
 *
 */
@Controller
public class EmployeeController {
  @Autowired
    private EmployeeService employeeService;
  @RequestMapping(value ="/employee" ,method = RequestMethod.GET)
  public String getAllEmployee(Model model){
      List<Employee> list = employeeService.getAllEmployee();
      model.addAttribute("list",list);
      return "employee_list";
  }





    @RequestMapping( value = "/testPageInfo" ,method = RequestMethod.GET)
  public String toPageInfo( Model model){
      PageInfo<Employee> employeeList = employeeService.getEmployeeList(1);
      model.addAttribute("pageInfo",employeeList);
      return "testPageInfo";
    }
    @RequestMapping( value = "/employee/page/{pageNum}" ,method = RequestMethod.GET)
    public String getEmployeePage(Model model, @PathVariable("pageNum") Integer pageNum){
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        model.addAttribute("page",page);
        return "employee_list";
    }
}
