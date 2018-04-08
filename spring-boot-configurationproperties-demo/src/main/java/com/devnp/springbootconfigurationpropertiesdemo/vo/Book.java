/**
 * 
 */
package com.devnp.springbootconfigurationpropertiesdemo.vo;

/**
 * @author duliu
 *
 */
public class Book {

	private String author ;
	
	private String name ;
	
	private Double price ;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", name=" + name + ", price=" + price + "]";
	}
	
}
