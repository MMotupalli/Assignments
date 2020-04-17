package com.cg.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


public class Student {
			
	@Size(min = 3, max = 15, message = "Student Name must contain 3 and 15 chars")
	@NotEmpty(message = "Student Name is Manadatory")
	@Pattern(regexp = "[a-zA-Z]+", message="Student Name must contain alphabets")
	private String stuName;
	
	@Min(value=0)
	@Max(value=100)
	@NotNull(message="Marks is manadatory")
	private Integer javaMarks;
	
	@Min(value=0)
	@Max(value=100)
	@NotNull(message="Marks is manadatory")
	private Integer angMarks;
	
	@Min(value=0)
	@Max(value=100)
	@NotNull(message="Marks is manadatory")
	private Integer springMarks;
	
	@NotNull(message="dob is manadatory")
	@DateTimeFormat(pattern = "yyyy-M-d")
	@Past(message="date must be past date")
	private LocalDate doj;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getJavaMarks() {
		return javaMarks;
	}

	public void setJavaMarks(Integer javaMarks) {
		this.javaMarks = javaMarks;
	}

	public Integer getAngMarks() {
		return angMarks;
	}

	public void setAngMarks(Integer angMarks) {
		this.angMarks = angMarks;
	}

	public Integer getSpringMarks() {
		return springMarks;
	}

	public void setSpringMarks(Integer springMarks) {
		this.springMarks = springMarks;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	
	
	
}
