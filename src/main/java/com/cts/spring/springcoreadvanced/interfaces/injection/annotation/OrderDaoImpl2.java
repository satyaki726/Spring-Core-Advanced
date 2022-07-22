package com.cts.spring.springcoreadvanced.interfaces.injection.annotation;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDaoImpl2 implements OrderDao {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDaoImpl2");
	}

}
