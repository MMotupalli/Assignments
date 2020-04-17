package com.cg.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class EmiInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, 
			Object arg2, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object obj, ModelAndView mv)
			throws Exception {
		double ci = (double)mv.getModel().get("totalamt");
		System.out.println("logged totalamount" +ci);
		ci = Math.round(ci * 100)/100.0;
		System.out.println("rounded to 2 decimal places" +ci);
		mv.getModel().put("totalamt", ci);
		System.out.println("logged monthlyamount" +ci);
		double emi = (double)mv.getModel().get("monthlyamt");
		emi = Math.round(ci * 100)/100.0;
		mv.getModel().put("monthlyamt", emi);
		System.out.println("rounded to 2 decimal places" +ci);
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object obj) throws Exception {
		// TODO Auto-generated method stub
		double amt = Double.parseDouble(req.getParameter("txtamt"));
		System.out.println("logged " + amt);
		if (amt < 50000) {
			System.out.println("amt is less than 50000");
			req.setAttribute("msg", "amount must be min Rs.50000");
			RequestDispatcher rd =req.getRequestDispatcher("WEB-INF/ErrorPage.jsp");
			rd.forward(req, resp);
			return false;
		}
			
		return true;
	}

	
	
}
