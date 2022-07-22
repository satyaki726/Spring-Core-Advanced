package com.cts.spring.springcoreadvanced.interfaces.injection.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/spring/springcoreadvanced/interfaces/injection/annotation/interfaceAnnotationConfig.xml");
		OrderBoImpl bean =(OrderBoImpl) ctx.getBean("bo");
		bean.businessOrder();
	}
}
