package com.spring;

public class Students {
	
	
	private String Strudentid;
	private String studentname;
	private int marks;
	
	
	/*
	 * if any parameter constructor is defined then  we need to define the default constructore for 
	 * the same class because the JVM will not provide the default constructor
	 * to the Spring if no parameter constructor is no created then JVM will give default constructore will be provided 
	 */
	
	
	
	
	/*
	 * We can Assign the values to the above variables through beans.XMl 
	 * we have 2 ways 
	 * 1. property tag - this uses the setters and getters in java 
	 * 2. constructor tag - this uses the constructors of the class
	 * 
	 */
	public String getStrudentid() {
		return Strudentid;
	}
	public Students() {
		super();
	}
	public Students(String strudentid, String studentname, int marks) {
		super();
		Strudentid = strudentid;
		this.studentname = studentname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [Strudentid=" + Strudentid + ", studentname=" + studentname + ", marks=" + marks + "]";
	}
	public void setStrudentid(String strudentid) {
		Strudentid = strudentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
