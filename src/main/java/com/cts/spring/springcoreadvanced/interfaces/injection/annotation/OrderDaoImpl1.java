package com.cts.spring.springcoreadvanced.interfaces.injection.annotation;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDaoImpl1 implements OrderDao {

	@Override
	public void createOrder() {
		
		System.out.println("Inside OrderDaoImpl1");
		
	}
	
}
