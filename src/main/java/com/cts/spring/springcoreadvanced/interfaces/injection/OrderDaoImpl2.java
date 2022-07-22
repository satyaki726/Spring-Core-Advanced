package com.cts.spring.springcoreadvanced.interfaces.injection;

public class OrderDaoImpl2 implements OrderDao {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDaoImpl2");
	}

}
