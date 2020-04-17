package com.cg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class HomeController {

	//@GetMapping("/home")
	@RequestMapping("/home")
	public String displayHomePg() {
		return "HomePage";
	}
	
}
