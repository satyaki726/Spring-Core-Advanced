package com.cts.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/spring/springcore/propertyplaceholder/config.xml");
		MyDao bean =(MyDao) ctx.getBean("dao");
		System.out.println(bean);
		
	}

}
