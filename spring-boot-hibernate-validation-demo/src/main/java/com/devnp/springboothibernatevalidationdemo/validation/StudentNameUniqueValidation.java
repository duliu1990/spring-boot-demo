/**
 * 
 */
package com.devnp.springboothibernatevalidationdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.devnp.springboothibernatevalidationdemo.service.StudentService;

/**
 * @author duliu
 *
 */
public class StudentNameUniqueValidation implements ConstraintValidator<StudentNameUnique, Object>{

	
	@Autowired
	private StudentService studentService ;
	
	@Override
	public void initialize(StudentNameUnique constraintAnnotation) {
		// TODO Auto-generated method stub
		System.out.println("Student Name Unique Validation Init...");
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return studentService.nameUniqueCheck((String) value);
	}

}
