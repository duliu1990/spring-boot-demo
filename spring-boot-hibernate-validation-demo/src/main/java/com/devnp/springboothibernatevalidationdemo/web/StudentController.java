/**
 * 
 */
package com.devnp.springboothibernatevalidationdemo.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devnp.springboothibernatevalidationdemo.dto.StudentDto;

/**
 * @author duliu
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private MessageSource messageSource;

	@RequestMapping(path="/add", method= {RequestMethod.POST})
	public String add(@Valid @RequestBody StudentDto studentDto, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			bindingResult.getAllErrors().stream().forEach(error -> {System.out.println(error.getDefaultMessage());});
		}
		
		System.out.println(studentDto);
		
		return messageSource.getMessage("return.msg", null, LocaleContextHolder.getLocale()) ;
	}
}
