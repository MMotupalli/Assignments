package com.cg.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoggerInterceptor implements HandlerInterceptor{
	//this method is invoked before sending the response
	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse arg1, Object obj, Exception arg3)
			throws Exception {
		HandlerMethod mtd =(HandlerMethod)obj;
		String str = mtd.getMethod().getName() + " method of " + mtd.getBean().getClass().getSimpleName() ;
		System.out.println(str + "sending the JSP Response  to the browser for the URI " + req.getRequestURI());
	}

	//this method is invoked after accessing the controller
	@Override
	public void postHandle(HttpServletRequest req, 	HttpServletResponse arg1, Object obj, ModelAndView mv)
			throws Exception {
		HandlerMethod mtd =(HandlerMethod)obj;
		String str = mtd.getMethod().getName() + " method of " + mtd.getBean().getClass().getSimpleName() ;
		String jsp =mv.getViewName();
		System.out.println(str + " is executed and forwarding to the JSP " + jsp + " for the URI " + req.getRequestURI());
	}

	//this method is invoked before accessing the controller
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse arg1, Object obj) throws Exception {
		HandlerMethod mtd =(HandlerMethod)obj;
		String str = mtd.getMethod().getName() + " method of " + mtd.getBean().getClass().getSimpleName() ;
		System.out.println("It is invoking the " + str + "for the URI " +req.getRequestURI());
		return true;
	}

}

