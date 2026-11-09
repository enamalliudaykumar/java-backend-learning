package com.spring.DI;

public class Address {
	
	private String line1;
	private int pincode;
	private String state;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", pincode=" + pincode + ", state=" + state + "]";
	}
	

}
