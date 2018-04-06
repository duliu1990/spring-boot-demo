/**
 * 
 */
package com.devnp.springbootexceptionhandlerdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author P1205972
 *
 */
@RestController
public class StatusController {
	
	@RequestMapping("/404")
	public String status404() {
		return "This is Custom 404 " ;
	}
	
	@RequestMapping("/500")
	public String status500() {
		return "This is Custom 500" ;
	}

}
