package com.devnp.springbootexceptionhandlerdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@RequestMapping("/basicerror")
	public void basicError() throws Exception {
		
		throw new Exception("Basic Error.");
		
	}
}
