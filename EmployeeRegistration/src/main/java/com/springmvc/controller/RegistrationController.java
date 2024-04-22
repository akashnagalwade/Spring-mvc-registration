package com.springmvc.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Employee;
import com.springmvc.service.EmployeeService;

@Controller
public class RegistrationController {

  @Autowired
  public EmployeeService employeeService;

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegisterPage(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mv = new ModelAndView("register");
    mv.addObject("employee", new Employee());
    return mv;
  }

  
  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addEmployee(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("employee") Employee employee) {

    employeeService.register(employee);
    return new ModelAndView("welcome", "name", employee.getName());
  }
  
  
  @RequestMapping(value = "/listEmployees", method = RequestMethod.GET)
  public ModelAndView listEmployees() {
	  List<Employee> employees = employeeService.getAllEmployees();
	  
      ModelAndView modelAndView = new ModelAndView("welcomePage");
      modelAndView.addObject("employees", employees);
      return modelAndView;
  }
  
}
