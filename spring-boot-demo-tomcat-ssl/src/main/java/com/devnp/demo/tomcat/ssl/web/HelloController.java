package com.devnp.demo.tomcat.ssl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author duliu
 *
 */
@Controller
public class HelloController {

	@GetMapping("/")
	@ResponseBody
	public String helloWorld() {
		return "Hello, world";
	}
}
