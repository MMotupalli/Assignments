package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cg.entity.Emp;

//@Service
public class EmpService implements IEmpSer {
	
//	@Autowired
	public Map<Integer, Emp> emap;
	
	public void setEmap(Map<Integer, Emp> emap) {
		this.emap = emap;
	}

	@Override
	public Emp getEmployee(int eid) {
		return emap.get(eid);
	}
	
	@Override
	public List<Emp> getEmployee() {
		return new ArrayList(emap.values());
	}

	@Override
	public boolean addEmployee(Emp emp) {
		emap.put(emp.getEmpId(), emp);
		return true;
	}

}
