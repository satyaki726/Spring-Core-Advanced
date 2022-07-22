package com.cts.spring.springcoreadvanced.interfaces.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBo {
	
	@Autowired
	@Qualifier("dao1")
	private OrderDao orderDao;

	@Override
	public void businessOrder() {
		System.out.println("Inside OrderBoImpl");
		orderDao.createOrder();
	}


}
