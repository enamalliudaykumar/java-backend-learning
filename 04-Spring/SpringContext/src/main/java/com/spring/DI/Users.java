package com.spring.DI;

public class Users {
	
	private String userName;
	private int userid;
	Address address;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [userName=" + userName + ", userid=" + userid + ", address=" + address + "]";
	}

}
