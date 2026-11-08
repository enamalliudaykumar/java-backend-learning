package com.entity.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROJECT_DETAILS")
public class ProjectEntity {
	
	@Id
	@Column(name = "PROJECTID")
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private int project_id;
	@Column(name = "PROJECTNAME", nullable = false)
	private String Project_Name;
	@Column(name = "PROJECT_DURATION",nullable = false)
	private int Duration;
	
	@ManyToMany
	@JoinTable(name = "PROJECT_EMPLOYEE_DETAILS",joinColumns =@JoinColumn(name = "PROJECTID"),
												inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
	private List<EmployeeEntity> employe = new ArrayList<EmployeeEntity>();
	
	
	public ProjectEntity () {
		
	}
	public ProjectEntity(String project_Name, int duration) {
		super();
		Project_Name = project_Name;
		Duration = duration;
	}
	public ProjectEntity(String project_Name, int duration, List<EmployeeEntity> employe) {
		super();
		Project_Name = project_Name;
		Duration = duration;
		this.employe = employe;
	}
	public String getProject_Name() {
		return Project_Name;
	}
	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public List<EmployeeEntity> getEmploye() {
		return employe;
	}
	public void setEmploye(List<EmployeeEntity> employe) {
		this.employe = employe;
	}
	@Override
	public String toString() {
		return "ProjectEntity [project_id=" + project_id + ", Project_Name=" + Project_Name + ", Duration=" + Duration
				+ ", employe=" + employe + "]";
	}


}
