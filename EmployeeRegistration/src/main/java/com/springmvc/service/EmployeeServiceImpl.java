package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.dao.EmployeeDao;
import com.springmvc.model.Employee;
import com.springmvc.model.Login;

public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  public EmployeeDao employeeDao;

  public int register(Employee employee) {
    return employeeDao.register(employee);
  }

  public Employee validateEmployee(Login login) {
    return employeeDao.validateEmployee(login);
  }

public List<Employee> getAllEmployees() {
	return employeeDao.getAllEmployees();
}

}
