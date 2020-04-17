package com.cg.service;

import java.util.List;

import com.cg.entity.Emp;

public interface IEmpSer {
	Emp getEmployee(int eid);
	public List<Emp> getEmployee();
	boolean addEmployee(Emp emp);
}
