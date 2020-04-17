package com.cg.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Emp {
	
	@NotNull(message="Employee Id is mandatory")
	private Integer empId;
	
	@NotEmpty(message="Employee Name is Mandatory")
	@Size(min=3, max=15, message="can contain 3 and 15 chars")
	@Pattern(regexp = "[a-zA-Z]+", message="must contain only alphabets")
	private String empName;
	
	@NotNull(message="Salary is Mandatory")
	@Min(value=5000, message="Salary must be min Rs.5000")
	private Double empSal;
	
	@NotNull(message="Department is Mandatory")
	@Size(min=2, message="size must min 2 chars")
	private String dept;
	
	public Emp() {
		
	}
	public Emp(int empId, String empName, double empSal, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dept = dept;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public String getDept() {
		return dept;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
