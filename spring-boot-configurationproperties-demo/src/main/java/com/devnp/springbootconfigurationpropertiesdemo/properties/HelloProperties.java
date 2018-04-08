/**
 * 
 */
package com.devnp.springbootconfigurationpropertiesdemo.properties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.devnp.springbootconfigurationpropertiesdemo.vo.Book;
import com.devnp.springbootconfigurationpropertiesdemo.vo.Student;

/**
 * @author duliu
 *
 */
@Component
@ConfigurationProperties(prefix="hello")
@PropertySource("hello.properties")
public class HelloProperties {

	private String msg ;
	
	private Student student ;
	
	private List<Book> book ;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
}
