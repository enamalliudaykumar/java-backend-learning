package com.entity.ManyToMany;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private int emp_id;
	@Column(name = "EMPLOYEE_NAME",nullable = false)
	private String employeName;
	@Column(name = "MOBILE_NUMBER",nullable = false)
	private String mbnum;
	
	
	@ManyToMany(mappedBy = "employe",cascade =  CascadeType.ALL)
	private List<ProjectEntity> Projects = new ArrayList<ProjectEntity>();
	
	public EmployeeEntity() {
		super();
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public String getMbnum() {
		return mbnum;
	}

	public void setMbnum(String mbnum) {
		this.mbnum = mbnum;
	}

	public List<ProjectEntity> getProjects() {
		return Projects;
	}

	public void setProjects(List<ProjectEntity> projects) {
		Projects = projects;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [emp_id=" + emp_id + ", employeName=" + employeName + ", mbnum=" + mbnum + ", Projects="
				+ Projects + "]";
	}

	public EmployeeEntity(String employeName, String mbnum) {
		super();
		this.employeName = employeName;
		this.mbnum = mbnum;
	}

	public EmployeeEntity(String employeName, String mbnum, List<ProjectEntity> projects) {
		super();
		this.employeName = employeName;
		this.mbnum = mbnum;
		Projects = projects;
	}

	
	
	
}
