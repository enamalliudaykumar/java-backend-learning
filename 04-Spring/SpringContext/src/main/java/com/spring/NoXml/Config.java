package com.spring.NoXml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 *  we have removed the beans.xml insted of that we will be created the config class 
 */
@Configuration // This is the annotation represetns same like beans.xml 

@ComponentScan(basePackages = "com") // it is used to scan the project and identify the class fot creating the beans
@PropertySource("classpath:application.properties") // this annotation 
public class Config {

}
