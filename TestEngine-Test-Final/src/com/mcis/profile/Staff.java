package com.mcis.profile;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STAFF")
public class Staff extends Person {
	@Column(name="designation",nullable=true)
	private String designation;
	@Column(name="salary",nullable=true)
	private float salary;
	
	public Staff() {
		super();
	}
	public Staff(String designation, float salary) {
		super();
		this.designation = designation;
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
