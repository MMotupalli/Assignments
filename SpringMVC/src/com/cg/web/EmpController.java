package com.cg.web;

import java.util.Map;

import javax.validation.Valid;

import org.aspectj.apache.bcel.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entity.Emp;
import com.cg.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;

	@RequestMapping("empform.htm")
	public String displayEmpForm() {
		return "Empfrm";
	}
	
	@RequestMapping("search.htm")
	public String processEmpbyId(@RequestParam("txtsearch") int eid, Model  model) {
		Emp emp = service.getEmployee(eid);
		model.addAttribute("employee", emp);
		return "EmpView";
	}
	
	@RequestMapping("addform.htm")
	public String showAddEmpForm(Model  model) {
		
		model.addAttribute("emodel", new Emp());
		return "AddEmpPage";
	}
	
	@PostMapping("add.htm")
	public String addEmployee(@Valid @ModelAttribute("emodel") Emp emp, BindingResult br,Model  model) {
		if(br.hasErrors())
			return "AddEmpPage";
		model.addAttribute("msg", "Employee Added Successfully");
		service.addEmployee(emp);
		model.addAttribute("elist", service.getEmployee());
		return "AddEmpResultPage";
	}
	
}
