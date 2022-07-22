package com.cts.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/cts/spring/springcoreadvanced/autowiring/byXmlAutowiringConfig.xml");
		Employee bean =(Employee) ctx.getBean("employee");
		System.out.println(bean);
	}

}
