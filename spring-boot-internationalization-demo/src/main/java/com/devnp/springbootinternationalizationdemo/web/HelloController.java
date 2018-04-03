/**
 * 
 */
package com.devnp.springbootinternationalizationdemo.web;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duliu
 *
 */
@RestController
public class HelloController {
	
	@Autowired
    private MessageSource messageSource;

	@RequestMapping("/hello")
	public String index() {
		Locale locale = LocaleContextHolder.getLocale();
		
		String message = messageSource.getMessage("msg.hello", null, locale);
		
		return message;
	}
}
