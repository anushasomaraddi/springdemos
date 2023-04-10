package com.examples.S08SpringMVCDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S08SpringMVCDemo.model.Employee;

@Controller
public class HelloController {
	
		@RequestMapping("/hello")
		public ModelAndView hello() {
			ModelAndView modelView=new ModelAndView();
			modelView.addObject("id",123);
			modelView.addObject("name","Ken");
			modelView.addObject("salary",10000);
			modelView.setViewName("hello");
			return modelView;
			
		}
	
@RequestMapping("/readobject")
public ModelAndView read2() {
	ModelAndView modelView=new ModelAndView();
	Employee emp=new Employee();
	emp.setId(1234);
	emp.setName("Mary");
	emp.setSalary(234445);
	modelView.setViewName("hello");
	return modelView;
}
@RequestMapping("/employees")
public ModelAndView read3() {
	ModelAndView modelView=new ModelAndView();
	List<Employee>employees=new ArrayList<>();
	Employee emp=new Employee();
	emp.setId(1234);
	emp.setName("Mary");
	emp.setSalary(234445);
	employees.add(emp);
	
	emp=new Employee();
	emp.setId(12);
	emp.setName("Max");
	emp.setSalary(234);
	employees.add(emp);
	
	emp=new Employee();
	emp.setId(1);
	emp.setName("Mohan");
	emp.setSalary(2344);
	employees.add(emp);
	
	
	modelView.addObject("employees",employees);
	modelView.setViewName("employees");
	return modelView;
}
@RequestMapping("/showdata")
public ModelAndView showData(@RequestParam("id")int id,@RequestParam("name") String name) {
	System.out.println("Id"+id);
	System.out.println("Name"+name);
	ModelAndView mv=new ModelAndView();
	mv.addObject("id",id);
	mv.addObject("name",name);
	mv.setViewName("showdata");
	return mv;
}
}