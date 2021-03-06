package com.authorandbook.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "author_collection") 
public class Author implements Serializable{

	private static final long serialVersionUID = -3776226123284943027L;

	@Id	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private List<Book> books;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", "
				+ "books=" + "]";
	}	
	
}
