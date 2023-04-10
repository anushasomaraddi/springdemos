package com.examples.Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/Autowiring/springconfig.xml");
		Employee emp1=(Employee) ctx.getBean("emp1");
    	System.out.println(emp1);
	}

}
