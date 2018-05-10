/**
 * 
 */
package com.devnp.springbootwardemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duliu
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello world." ;
	}
}
