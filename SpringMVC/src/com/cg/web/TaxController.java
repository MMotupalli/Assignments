package com.cg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaxController {

	@RequestMapping("home.htm")
	public String displayHomePg() {
		return "Home";
	}

	@RequestMapping("taxform.htm")
	public String displayTaxPg() {
		System.out.println("Iam in tax controller - display taxpg");
		return "Taxfrm";
	}

	@RequestMapping("tax.htm")
	public String calculateTax(@RequestParam("txtincome") double income, Model model) {
		System.out.println("Iam in tax controller - calculatetax");
		double tax = 0;
		if(income > 1000000)
			tax = 500000 * 0.1 + (income - 1000000) * 0.15;
		else if(income > 500000)
			tax = (income - 500000) * 0.1;
		model.addAttribute("taxresult", tax);
		return "Taxview";
	}

}
