package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "HIBER_AADHAR_TABLE")
public class OneToOneEntity2 {
	
	@Id
	@Column(name = "AADHAR_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	@Column(name = "AADHAR_NAME")
	private String aadharName;
	@Column(name = "AADHAR_NUMBER")
	private int aadharNumber;
	@OneToOne(mappedBy = "OneToOneEntity2")
	private OneToOneEntity citizen;
	
	@Override
	public String toString() {
		return "OneToOneEntity2 [id=" + id + ", aadharName=" + aadharName + ", aadharNumber=" + aadharNumber
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public OneToOneEntity2(String aadharName, int aadharNumber) {
		super();
		this.id = id;
		this.aadharName = aadharName;
		this.aadharNumber = aadharNumber;
	}
	public int getId() {
		return id;
	}
	public OneToOneEntity2() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getAadharName() {
		return aadharName;
	}
	public void setAadharName(String aadharName) {
		this.aadharName = aadharName;
	}
	public int getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

}
