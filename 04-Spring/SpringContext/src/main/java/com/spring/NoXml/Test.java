package com.spring.NoXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		
		NoXmlUsers bean = container.getBean(NoXmlUsers.class);
		System.out.println(bean);
		
	}

}
