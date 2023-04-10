package com.examples.S05SpringJdbcDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Component;

import com.examples.S05SpringJdbcDemo.entity.Employee;
import com.examples.S05SpringJdbcDemo.rowmapper.EmployeeRowMapper;

@Component("employeedao")

public class EmployeeDaoImpl implements EmployeeDAO{


@Autowired

private JdbcTemplate jdbcTemplate;

@Override

public int create(Employee employee) {


String sql ="insert into employee values(?,?,?)";

int result = jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());


return result;

}



@Override

public int update(Employee employee) {
	String sql="Update employee SET firstname =?,lastname=? WHERE id=?";
	int result = jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());

return result;

}



@Override

public int delete(int id) {
	String sql="DELETE FROM employee WHERE id=?";
	int result = jdbcTemplate.update(sql,id);

return result;

}
public Employee read(int id) {
	String sql="Select * from employee where id=?";
	EmployeeRowMapper employeerowMapper=new EmployeeRowMapper();
	Employee employee=jdbcTemplate.queryForObject(sql,employeerowMapper,id);
	return employee;
}
@Override
public List<Employee>read(){
	String sql="Select * from employee";
	EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
	List<Employee>employees=jdbcTemplate.query(sql, employeeRowMapper);
	return employees;
}




}