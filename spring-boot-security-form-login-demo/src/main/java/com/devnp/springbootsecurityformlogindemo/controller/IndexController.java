/**
 * 
 */
package com.devnp.springbootsecurityformlogindemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author duliu
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		
		return "login-form" ;
	}
	
	@RequestMapping("/index")
	@ResponseBody
	public Object welcome(@Autowired Authentication authentication) {
		
		return authentication ;
	}
}
