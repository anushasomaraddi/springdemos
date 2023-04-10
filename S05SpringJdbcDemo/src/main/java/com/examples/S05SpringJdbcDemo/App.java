package com.examples.S05SpringJdbcDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S05SpringJdbcDemo.dao.EmployeeDAO;
import com.examples.S05SpringJdbcDemo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("JDBCTemplate Demo");
		// traditional way
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJdbcDemo/springconfig.xml");
//	  	JdbcTemplate jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbctemplate");
//	 	String sql="insert into employee values(?,?,?)";
//	 	int result=jdbcTemplate.update(sql,1,"AB","S");
//	  	System.out.println("No of records inserted"+result);

       create();
		// update();
		// delete();
//      readOneEmployee();
      readAllEmployees();
      }

	private static void delete() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		employeeDao.delete(2);
	}

	private static void update() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("beam");
		emp.setLastName("Wall");
		employeeDao.update(emp);
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("John");
		emp.setLastName("Smith");
		employeeDao.create(emp);

	}

	private static void readAllEmployees() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		List<Employee> employees = employeeDao.read();
		System.out.println(employees);
	}

	private static void readOneEmployee() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJdbcDemo/springconfig.xml");
		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		Employee employee = employeeDao.read(1);
         System.out.println(employee);
	}
}
