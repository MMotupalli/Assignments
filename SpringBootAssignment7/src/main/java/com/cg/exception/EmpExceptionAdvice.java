package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmpExceptionAdvice {
	
	@ExceptionHandler(value= {EmpIdException.class})
	@ResponseStatus(code=HttpStatus.BAD_REQUEST,reason="ID already exists")
	@ResponseBody
	public void handlerException1(Exception ex) {
		
	}
	
	@ExceptionHandler(value= {EmpNotFoundException.class})
	@ResponseStatus(code=HttpStatus.NOT_FOUND,reason="Employee Not Found")
	@ResponseBody
	public void handlerException2(Exception ex) {
		
	}
	
	@ExceptionHandler(value= {HttpMessageNotReadableException.class})
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ErrorInfo handlerException3(Exception ex) {
		if(ex.getMessage().contains("doj"))
			return new ErrorInfo("Date must have the pattern yyyy-M-d ");
		else return new ErrorInfo(ex.getMessage());
		
	}
	
	
}
