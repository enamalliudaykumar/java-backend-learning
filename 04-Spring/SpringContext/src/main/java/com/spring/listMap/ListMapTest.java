package com.spring.listMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListMapTest {
	
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext containerContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee bean = containerContext.getBean("lm",Employee.class);
		
		System.out.println(bean);
		
	}

}
