package com.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) //if the value is auto generated in the database
	private int id;
	private String name;
	private String dep;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public Students() {
		
	}
public Students(String name , String dep ) {
	this.id=id;
	this.name=name;
	this.dep=dep;
		
	}

public Students(int id, String name , String dep ) {
	this.id=id;
	this.name=name;
	this.dep=dep;
		
	}

public Students(int id ) {
	this.id=id;
	this.name=name;
	this.dep=dep;
		
	}


@Override
public String toString() {
	return "Students [id=" + id + ", name=" + name + ", dep=" + dep + "]";
}

}
