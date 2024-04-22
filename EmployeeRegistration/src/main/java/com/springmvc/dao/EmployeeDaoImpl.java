package com.springmvc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.model.Employee;
import com.springmvc.model.Login;

public class EmployeeDaoImpl implements EmployeeDao {
	
  @Autowired
  DataSource datasource;
  
  @Autowired
  JdbcTemplate jdbcTemplate;

  public int register(Employee employee) {
    String sql = "insert into employee values(?,?,?,?,?,?,?,?)";

    return jdbcTemplate.update(sql, new Object[] {employee.getName(), employee.getDateOfBirth(), employee.getGender(),
            employee.getAddress(), employee.getCity(), employee.getState(), employee.getLoginId(),
            employee.getPassword()});
  } 
  public Employee validateEmployee(Login login) {
	    String sql = "select * from employee where login_id='" + login.getLoginId() + "' and password='" + login.getPassword() + "'";
	    List<Employee> employees = jdbcTemplate.query(sql, new EmployeeMapper());

	    return employees.isEmpty() ? null : employees.get(0);
	}
  public List<Employee> getAllEmployees() {
	    String sql = "SELECT * FROM employee";
	    List<Employee> employees = jdbcTemplate.query(sql, new EmployeeMapper());
	    return employees;
	} 
}

class EmployeeMapper implements RowMapper<Employee> {

  public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
    Employee emp = new Employee();
    emp.setName(rs.getString("name"));
    emp.setDateOfBirth(rs.getString("dateOfBirth"));
    emp.setGender(rs.getString("gender"));
    emp.setAddress(rs.getString("address"));
    emp.setCity(rs.getString("city"));
    emp.setState(rs.getString("state"));
    emp.setLoginId(rs.getString("login_id"));
    emp.setPassword(rs.getString("password")); 
    return emp;
  }

}