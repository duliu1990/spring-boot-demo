/**
 * 
 */
package com.devnp.springbootemaildemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author duliu
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		return "index" ;
	}
}
