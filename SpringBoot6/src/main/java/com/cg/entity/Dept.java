package com.cg.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="lpu_dept")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Dept {
	
	@Id
	@Column(name="did")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	
	@Column(name="dname",length=25)
	private String deptName;
	
	@JsonIgnore
	@OneToMany(mappedBy="dept",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<Emp> employee =new HashSet<>();
	

	public Set<Emp> getEmployee() {
		return employee;
	}

	
	public void setEmployee(Set<Emp> employee) {
		this.employee = employee;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return deptId+" "+deptName;
	}


}
