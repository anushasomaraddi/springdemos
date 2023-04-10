package com.examples.S09SpringMVCDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.S09SpringMVCDemo.entity.Users;
import com.examples.S09SpringMVCDemo.exception.UserAlreadyExistsException;
import com.examples.S09SpringMVCDemo.service.UserService;



@Controller
public class UserController {
@Autowired
private UserService userService;
@RequestMapping("/register")
public String showRegistrationPage() {
	return "userreg";
}
@RequestMapping("/registeruser")
public String registerUser(@ModelAttribute("user") Users user,ModelMap model) {
	int result;
	try{
		result=userService.save(user);
		model.addAttribute("message", "User created with id"+result);
		model.addAttribute("users", userService.getUsers());
	}catch(UserAlreadyExistsException uaex) {
		model.addAttribute("message",uaex.getMessage());
		
	}
	
	return "userreg";
}
@RequestMapping("/users")
public String getUsers(ModelMap model) {
	model.addAttribute("users", userService.getUsers());
	return "displayusers";
	
}
}
