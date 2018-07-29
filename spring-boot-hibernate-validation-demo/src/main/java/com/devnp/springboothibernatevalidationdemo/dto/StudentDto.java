/**
 * 
 */
package com.devnp.springboothibernatevalidationdemo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import com.devnp.springboothibernatevalidationdemo.validation.StudentNameUnique;

/**
 * @author duliu
 *
 */
public class StudentDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	@NotBlank(message="{stu.name.not.blank}")
	@StudentNameUnique
	private String stuName ;
	
	
	/**
	 * Student age should be > 18 and < 130
	 */
	@Range(min= 18, max=130, message="{stu.age.range}")
	@NotNull(message="{stu.age.not.blank}")
	private Integer stuAge ;
	
	/**
	 * 
	 */
	@NotNull(message="{stu.birth.not.blank}")
	private Date stuBirth ;
	

	public StudentDto() {
		super();
	}

	public StudentDto(String stuName, Integer stuAge, Date stuBirth) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuBirth = stuBirth;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public Date getStuBirth() {
		return stuBirth;
	}

	public void setStuBirth(Date stuBirth) {
		this.stuBirth = stuBirth;
	}

	@Override
	public String toString() {
		return "StudentDto [stuName=" + stuName + ", stuAge=" + stuAge + ", stuBirth=" + stuBirth + "]";
	}

}
