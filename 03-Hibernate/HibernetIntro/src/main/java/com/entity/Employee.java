package com.entity;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HIBER_EMPLOYEE") // if the Data base Table is not matching with class file name we use this Annotations to Map the data base table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "EMPLOYEE_NAME")	
	private String employeName;
	@Column(name = "EMPLOYEE_ID")	
	private double employee_id;
	@Column(name = "SALARY")	
	private double salary;

	public Employee(String employeName, double employee_id, double salary) {
		super();
		this.employeName = employeName;
		this.employee_id = employee_id;
		this.salary = salary;
	}
	

	
	// REQUIRED BY HIBERNATE
    public Employee() {
    }

	

	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeName() {
		return employeName;
	}

	
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public double getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(double employee_id) {
		this.employee_id = employee_id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", employeName=" + employeName + ", employee_id=" + employee_id + ", salary="
				+ salary + "]";
	}

}
