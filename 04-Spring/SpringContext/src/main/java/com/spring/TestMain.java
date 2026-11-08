package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	
	public static void main(String[] args) {
		
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // we need to pass the beans.xml name the it can be loaded 
			/*We  have created the appliction context to get the beans(objects) form the continer
			 * ApplicationContext is a interface that we have used the ClassPathXMLApplicationContext
			 * which is the child class of the Applicationcontext. We use this ClassPathXML*  if we are using the 
			 * beans.XML we have another child class i.e. AnnotationConfigApplicationContext  this can 
			 * be used when we crate the beans with Annotations.			
			*/
			Students studentbean = context.getBean("st",Students.class);
			System.out.println(studentbean);
			
			
			Students studentbean1 = context.getBean("st1",Students.class);
			System.out.println(studentbean1);
	}
}
