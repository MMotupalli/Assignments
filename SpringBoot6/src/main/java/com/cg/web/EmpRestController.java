package com.cg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.EmpIdException;
import com.cg.dao.EmpNotFoundException;
import com.cg.dao.IEmpDao;
import com.cg.entity.Dept;
import com.cg.entity.Emp;

@RestController
public class EmpRestController {

	@Autowired
	private IEmpDao dao;
	
	@GetMapping("/viewbyid/{empid}")
	public Emp getEmployeeById(@PathVariable("empid") int eid) throws EmpNotFoundException {
		Emp emp= dao.viewEmp(eid);
		if(emp==null) {
			throw new EmpNotFoundException();
		}
		return emp;
	}
	
	@GetMapping("viewall")
	public List<Emp> getAllEmployee(){
		return dao.viewEmp();
	}
	
	@GetMapping("viewbydept{dept}")
	public List<Emp> getEmployeeByDept(@PathVariable("dept") String dname){
		return dao.viewEmp(dname);
	}
	
	@GetMapping("viewdepts")
	public List<Dept> getDepartments(){
		return dao.viewDepts();
	}
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Emp emp) throws EmpIdException {
		try {
			dao.addEmp(emp);
			return "Added";
		}catch(Exception ex) {
			throw new EmpIdException();
		}
	}
	
	@PostMapping("edit")
	public String editEmployee(@RequestBody Emp emp) throws EmpIdException {
		dao.editEmp(emp);
		return "Successfully edited";
	}
	
	@DeleteMapping("/remove{id}")
	public String removeEmployee(@PathVariable("id") int id) throws EmpIdException{
		dao.deleteEmp(id);
		return "deleted";
	}

}
