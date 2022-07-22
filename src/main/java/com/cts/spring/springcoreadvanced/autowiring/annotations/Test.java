package com.cts.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/cts/spring/springcoreadvanced/autowiring/annotations/byAnnotationsAutowiringConfig.xml");
		Employee bean =(Employee) ctx.getBean("employee");
		System.out.println(bean);
	}

}
