/**
 * 
 */
package com.devnp.springbootexceptionhandlerdemo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author duliu
 *
 */
@ControllerAdvice
public class ExceptionController {

	/**
	 * 全局异常
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
    @ResponseBody
	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e){
		
        return e.getMessage();
	}
	
}
