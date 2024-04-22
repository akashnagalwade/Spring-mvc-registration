package com.springmvc.service;

import java.util.List;

import com.springmvc.model.Employee;
import com.springmvc.model.Login;

public interface EmployeeService {

  int register(Employee employee);

  Employee validateEmployee(Login login);
  
  List<Employee> getAllEmployees();
}
