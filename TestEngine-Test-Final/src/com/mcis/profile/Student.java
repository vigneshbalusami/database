package com.mcis.profile;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STD")
public class Student extends Person {
	@Column(name="level",nullable=true)
	 private String level;
	@Column(name="marks",nullable=true)
	 private float marks;
	 

	public Student() {
		super();
	}

	public Student(String level, float marks ) {
	//	super();
		this.level = level;
		this.marks = marks;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	 
}
