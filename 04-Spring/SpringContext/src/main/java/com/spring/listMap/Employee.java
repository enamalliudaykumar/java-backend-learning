package com.spring.listMap;

import java.util.List;
import java.util.Map;

public class Employee {

	private String employee_name;
	private int employee_id;
	

	public void setPrijectjump(Map<Integer, String> prijectjump) {
		this.prijectjump = prijectjump;
	}

	Map<Integer, String> prijectjump;

	public String getEmployee_name() {
		return employee_name;
	}

	@Override
	public String toString() {
		return "Employee [employee_name=" + employee_name + ", employee_id=" + employee_id + ", prijectjump="
				+ prijectjump + ", skills=" + skills + "]";
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	List<String> skills;
	

}
