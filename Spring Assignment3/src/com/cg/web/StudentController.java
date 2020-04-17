package com.cg.web;

import javax.validation.Valid;

import org.aspectj.apache.bcel.generic.NEW;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.entity.Emp;
import com.cg.entity.Student;

@Controller
public class StudentController {

	@GetMapping("/stuform")
	public String displayStuForm(Model model) {
		model.addAttribute("smodel", new Student());
		return "StudentFormPage";
	}
	
	@PostMapping("/stusubmit")
	public String calcStuScore(@Valid @ModelAttribute("smodel") Student stu, BindingResult br, Model model ) {
		if(br.hasErrors())
			return "StudentFormPage";
		int tot = stu.getJavaMarks() + stu.getAngMarks() + stu.getSpringMarks();
		double avg = Math.round(tot/3.0 *100)/100.0;
		model.addAttribute("total" ,tot);
		model.addAttribute("average" , avg);
		if(stu.getJavaMarks() >= 60 && stu.getAngMarks() >= 60 && stu.getSpringMarks() >= 60)
			model.addAttribute("result", "pass");
		else
			model.addAttribute("result", "fail");
		return "StuSubmitPage";
	}
}
