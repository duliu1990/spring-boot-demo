/**
 * 
 */
package com.devnp.springboothibernatevalidationdemo.service;

import org.springframework.stereotype.Component;

/**
 * @author duliu
 *
 */
@Component("studentService")
public class StudentService {

	public boolean nameUniqueCheck(String name) {
		
		if("Tom".equals(name))
			return false;
		
		return true ;
	}
}
