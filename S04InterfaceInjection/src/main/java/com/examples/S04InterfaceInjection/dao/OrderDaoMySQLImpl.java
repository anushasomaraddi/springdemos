package com.examples.S04InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class OrderDaoMySQLImpl implements OrderDAO{
	public void createOrder() {
		System.out.println("open connection to MySQL");
		System.out.println("Run insert statement on mysql");
	    System.out.println("order created in mysql DB");
	    
	    
	}

}
