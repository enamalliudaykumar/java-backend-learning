package com.entity;

import org.hibernate.annotations.Generated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "HIBER_CITIZEN_TABLE")
public class OneToOneEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CITIZEN_ID")
	private int id;
	@Column(name = "CITIZEN_NAME")
	private String citizenName;
	@Column(name = "CITIZEN_AGE")
	private int age;
	
	@JoinColumn(name = "AADHAR_ID")	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)// this cascade is used to save the data on in the Aadhartbale while presting the citizen table
	//we have used LAZY becuse we we select for citizen class the hiber will take the entry form both the tables we we use LAZY the hibernate wee frame select query only for the citizen table
	// we will LAZY EAGER
	private OneToOneEntity2 OneToOneEntity2;
	
	public OneToOneEntity(String citizenName, int age, com.entity.OneToOneEntity2 oneToOneEntity2) {
		super();
		this.citizenName = citizenName;
		this.age = age;
		OneToOneEntity2 = oneToOneEntity2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public int getAge() {
		return age;
	}
	public OneToOneEntity(String citizenName, int age) {
		super();
		this.id = id;
		this.citizenName = citizenName;
		this.age = age;
	}
	public OneToOneEntity() {
		super();
	}
	@Override
	public String toString() {
		return "OneToOneEntity [id=" + id + ", citizenName=" + citizenName + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
