package com.srkit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey implements Serializable
{
	// Serializable is a marker interface
	
	
	@Column(name = "ROLLNO")
	private Integer rollNumber;
	
	@Column(name = "SECTION")  //optional 
	private String section;

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	
}
