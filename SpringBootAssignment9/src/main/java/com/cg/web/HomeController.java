package com.cg.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.entity.Account;
import com.cg.entity.TransferBean;
import com.cg.service.AccountService;

@Controller
public class HomeController {
	
	@Autowired
	private AccountService service;
	
	@RequestMapping({"/","/home"})
	public String displayHomePage() {
		return "HomePage";
	}
	
	@GetMapping("/viewall")
	public String viewAllAccounts(Model model) {
		
		model.addAttribute("alist",service.viewAccount());
		return "AccountViewPage";
	}
	
	@GetMapping("/showaddform")
	public String displayAddForm(Model model) {
		model.addAttribute("abean", new Account());
		return "AddAccountPage";
	}
	
	@PostMapping("/add")
	public String addAccount(@Valid @ModelAttribute("abean") Account account,BindingResult br,Model model) {
		if(br.hasErrors())
			return "AddAccountPage";
		try {
			service.addAccount(account);
			model.addAttribute("msg", "Account add successfully");
			return "HomePage";
		}
		catch(Exception ex) {
			model.addAttribute("msg", "Id already exists");
			return "AddAccountPage";
		}
	}
	
	@GetMapping("/showtransfer")
	public String displayTransferFundPage(Model model) {
		model.addAttribute("tbean", new TransferBean());
		return "TransferFormPage";
	}
	
	@PostMapping("/submittransfer")
	public String transferMoney(@Valid @ModelAttribute("tbean") TransferBean transferBean,BindingResult br,Model model) {
		if(br.hasErrors())
			return "TransferFormPage";
		try {
			service.transferFund(transferBean.getFormAccountId(), transferBean.getToAccountId(), transferBean.getAmt());
			model.addAttribute("msg", "Fund Transfered successfully");
			return "HomePage";
		}
		catch(Exception ex) {
			model.addAttribute("msg",ex.getMessage());
			return "TransferFormPage";
		}
		
	}

}
