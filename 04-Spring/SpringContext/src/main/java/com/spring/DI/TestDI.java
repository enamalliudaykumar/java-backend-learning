package com.spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	
	public static void main(String[] args) {
		
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		Users bean = container.getBean("users", Users.class);
		System.out.println(bean);
		
		Products bean2 = container.getBean("prd",Products.class);
		System.out.println(bean2);
	}

}
