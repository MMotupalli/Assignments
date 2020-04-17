package com.cg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmiController {

	@GetMapping("/emiform")
	//@RequestMapping("/emiform")
	public String displayEmiForm() {
		return "EmiformPage";
	}
	
	@GetMapping("/emisubmit")
	//@RequestMapping("/emisubmit")
	public String displayEmiForm(@RequestParam("txtamt") double amt, @RequestParam("txtyears") int years, Model model) {
		double ci = amt * Math.pow((1+0.115), years);
		double emi = ci/(years * 12);
		model.addAttribute("totalamt", ci);
		model.addAttribute("monthlyamt", emi);
		return "EmiSubmitPage";
	}
	
}
