package com.cg.entity;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name="Emp_work")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Emp {
	
	@Id
	@Column(name="eid")
	private int empId;
	
	@Column(name="ename" ,length=25)
	private String empName;
	
	@Column(name="emp_sal")
	private double empSal;
	
	
	
	@JsonSerialize(using=LDTSerializer.class)
	@JsonDeserialize(using=LdtDeserializer.class)
	@DateTimeFormat(pattern ="yyyy-M-d")
	private LocalDate doj;
	
	@Transient
	private String strDoj;
	
	@ManyToOne
	@JoinColumn(name="dept_id", referencedColumnName="did")
	private Dept dept=new Dept();

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public String getStrDoj() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		this.strDoj = doj.format(dtFormatter);
		return this.strDoj;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + empSal + " " + dept + " " + doj + " " + strDoj;
	}

}
