package com.cg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.dao.IEmpDao;

@Controller
public class EmpController {

	@Autowired
	private IEmpDao dao;

	@GetMapping("/viewall")
	public String viewAll(Model model) {
		model.addAttribute("elist", dao.viewEmp());
		return "EmpviewPage";
	}

	@GetMapping("/viewbyid")
	public String viewByID() {
		return "ViewIdPage";
	}

	@GetMapping("/searchbyid")
	public String searchByID(@RequestParam("txteid") int eid, Model model) {
		model.addAttribute("emodel", dao.viewEmp(eid));
		return "ViewIdPage";
	}

	@GetMapping("/viewbydept")
	public String viewByDept(Model model) {
		model.addAttribute("dlist", dao.viewDepts());
		return "ViewDeptPage";
	}

	@GetMapping(value="/searchbydept")
	public String searchByDept(@RequestParam("txtdept") String dept, Model model) {
		model.addAttribute("elist", dao.viewEmp(dept));
		return "EmpviewPage";
	}

}
