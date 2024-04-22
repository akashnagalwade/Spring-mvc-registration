//package jbr.springmvc;
//
//import java.sql.Date;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import jbr.springmvc.model.Employee;
//import jbr.springmvc.model.Login;
//import jbr.springmvc.model.User;
//import jbr.springmvc.service.EmployeeService;
//import jbr.springmvc.service.UserService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:jbr/config/user-beans.xml" })
//public class EmployeeServiceTest {
//
//  @Autowired
//  private EmployeeService employeerService;
//
//  @Test
//  public void testRegister() {
//    Employee employee = new Employee();
//    employee.setName("ranjith");
// //   employee.setDateOfBirth(new Date("1990-01-01"));
// //   employee.setGender(/* Set Gender Here */);
// //   employee.setAddress("chennai, t.nagar");
// //   employee.setCity(/* Set City Here */);
//    employee.setState(/* Set State Here */);
//    employee.setLoginId(/* Set Login ID Here */);
//    employee.setPassword(/* Set Password Here */);
//
//    int result = userService.register(user);
//    Assert.assertEquals(1, result);
//  }
//
//  @Test
//  public void testValidateUser() {
//    Login login = new Login();
//    login.setUsername("ranjith");
//    login.setPassword("sekar");
//
//    User user = userService.validateUser(login);
//    Assert.assertEquals("Ranjith", user.getFirstname());
//  }
//
//}
