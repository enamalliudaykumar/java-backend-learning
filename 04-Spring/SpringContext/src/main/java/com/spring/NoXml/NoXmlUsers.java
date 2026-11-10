package com.spring.NoXml;

import org.springframework.stereotype.Component;

@Component 
/*
 * We will be @Component Annotation to create the bean for the class to avoid the entry in the beans.XML
 * After using this @Component we need to scan the component we can do in 2 ways one is enrty in the bean.XML 
 * and another one is we can use the annotataion 
 */
public class NoXmlUsers {
	
	private int userid;
	private String username;
   NoXmlAddress Address;
@Override
public String toString() {
	return "NoXmlUsers [userid=" + userid + ", username=" + username + ", Address=" + Address + "]";
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public NoXmlAddress getAddress() {
	return Address;
}
public void setAddress(NoXmlAddress address) {
	Address = address;
}

}
