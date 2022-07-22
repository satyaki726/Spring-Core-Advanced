package com.cts.spring.springcoreadvanced.stereotypes.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/cts/spring/springcoreadvanced/stereotypes/annotations/stereotypeConfig.xml");
		Instructor bean =(Instructor) ctx.getBean("instructor");
		System.out.println(bean);
	}

}
