package com.examples.S08SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S08SpringMVCDemo.model.User;

@Controller
public class UserController {
@RequestMapping("/register")
public ModelAndView showReistrationPage() {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("registeruser");
	
	
	return mv;
	
}
//or one more method
//public String showReistrationPage() {
	
//	return "registeruser";
//	
//}
@RequestMapping(value="/signupuser",method=RequestMethod.POST)
public ModelAndView SignUpUser(@ModelAttribute("user") User user) {
	System.out.println("From UI.Retrieved object from spring container"+user);
	ModelAndView mv=new ModelAndView();
	mv.addObject("user",user);
	mv.setViewName("registeruserresult");
	return mv;
}
//or one more method
//@RequestMapping(value="/signupuser",method=RequestMethod.POST)
//public String SignUpUser(@ModelAttribute("user") User user,ModelMap model) {
//	System.out.println("From UI.Retrieved object from spring container"+user);

//	model.addAttribute("user",user);

//	return "registeruserresult";
//}
}
