package com.cg.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class MyInterceptor implements HandlerInterceptor{

	//this method is invoked before sending the response
	@Override
	public void afterCompletion(HttpServletRequest req, 
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("after completion" + req.getRequestURI());
		
	}

	//this method is invoked after accessing the controller
	@Override
	public void postHandle(HttpServletRequest req, 
			HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("post handle" + req.getRequestURI());
		
	}

	//this method is invoked before accessing the controller
	@Override
	public boolean preHandle(HttpServletRequest req, 
			HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("pre handle" + req.getRequestURI());
		//returns true, it access the contrroler method
		return true;
	}

}
