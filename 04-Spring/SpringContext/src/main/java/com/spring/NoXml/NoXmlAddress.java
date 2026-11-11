package com.spring.NoXml;

import org.springframework.stereotype.Component;

@Component
/*
 * We will be @Component Annotation to create the bean for the class to avoid the entry in the beans.XML
 * After using this @Component we need to scan the component we can do in 2 ways one is enrty in the bean.XML 
 * and another one is we can use the annotataion 
 */
public class NoXmlAddress {
	
	private int doorno = 103;
	private String state="Andhra Pradesh";
	@Override
	public String toString() {
		return "NoXmlAddress [doorno=" + doorno + ", state=" + state + "]";
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
