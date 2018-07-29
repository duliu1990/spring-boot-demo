package com.devnp.springboothibernatevalidationdemo.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ METHOD, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {StudentNameUniqueValidation.class })
public @interface StudentNameUnique {
	
	String message() default "{stu.name.unique}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	

}
