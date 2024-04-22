package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Employee;
import com.springmvc.model.Login;
import com.springmvc.service.EmployeeService;

@Controller
public class LoginController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView mv = new ModelAndView("login");
		mv.addObject("login", new Login());

		return mv;
	}

	 @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	    public ModelAndView loginProcess(@ModelAttribute("login") Login login) {
	        ModelAndView mv =null;

	        Employee employee = employeeService.validateEmployee(login);
      //   System.out.println("emp"+employee);
	        if (employee != null) {
	           return new ModelAndView("welcome","name",employee.getName());
	        } else {
	            mv = new ModelAndView("login");
	            mv.addObject("message", "Login Id or Password is incorrect!");
		        return mv;

	        }
	    }

}
