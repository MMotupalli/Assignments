package com.cg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

@Controller
@EnableTransactionManagement
public class EmpManipulateController {
	@Autowired
	private IEmpDao dao;

	@GetMapping("/showaddform")
	public String showAddEmployee(Model model) {
		model.addAttribute("dlist", dao.viewDepts());
		return "AddEmpPage";
	}

	@PostMapping("/add")
	public String addEmployee(@ModelAttribute("emodel") Emp emp, Model model) {
		try {
			dao.addEmp(emp);
			model.addAttribute("msg", "Employee Added");
			return "HomePage";
		} catch (Exception ex) {
			System.out.println("message" + ex.getMessage());
			model.addAttribute("dlist", dao.viewDepts());
			model.addAttribute("msg", "ID already exists");
			return "AddEmpPage";
		}

	}

	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("txteid") Integer eid, @RequestParam("dname") String dept, Model model) {
		dao.deleteEmp(eid);
		if (dept.isEmpty())
			return "redirect:viewall";
		else
			return "redirect:viewbydept?txtdept=" + dept;
	}

	@GetMapping("/edit")
	public String editEmployee(@RequestParam("txteid") int eid, @RequestParam("dname") String dept, Model model) {
		model.addAttribute("emodel", dao.viewEmp(eid));
		return "EditFormPage";
	}

	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute("emodel") Emp emp, @RequestParam("txtdept") String dept, Model model) {
		dao.editEmp(emp);
		if (dept.isEmpty())
			return "redirect:viewall";
		else
			return "redirect:viewbydept?txtdept=" + dept;
	}

}
