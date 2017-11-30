package com.onlinebookstorespringrest.category;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onlinebookstorespringrest.book.Book;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String categoryName;
	
	//@JsonProperty("someSingleValuedField")
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	private Set<Book> categoryBooks = new HashSet<Book>();
	
	
	
	public Set<Book> getCategoryBooks() {
		return categoryBooks;
	}
	public void setCategoryBooks(Set<Book> categoryBooks) {
		this.categoryBooks = categoryBooks;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
}
