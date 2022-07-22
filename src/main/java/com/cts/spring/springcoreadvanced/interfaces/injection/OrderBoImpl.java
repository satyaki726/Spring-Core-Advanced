package com.cts.spring.springcoreadvanced.interfaces.injection;

public class OrderBoImpl implements OrderBo {

	private OrderDao orderDao;

	@Override
	public void businessOrder() {
		System.out.println("Inside OrderBoImpl");
		orderDao.createOrder();
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

}
