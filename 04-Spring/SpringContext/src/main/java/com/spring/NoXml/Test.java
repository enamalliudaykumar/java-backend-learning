package com.spring.NoXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		/*
		 * We will be doing the noXML so  we will not be using the beans.xml 
		 * if we using the beans.xml then we can use the ClassPathXmlApplicationContext
		 * 
		 * NoXML means we are using Annotation for Annotations we will using the A
		 */
		
		  AnnotationConfigApplicationContext annotationConfigApplicationContext = new 
				  AnnotationConfigApplicationContext(Config.class);
		
		NoXmlUsers bean = annotationConfigApplicationContext.getBean(NoXmlUsers.class);
		System.out.println(bean);
		
	}

}
