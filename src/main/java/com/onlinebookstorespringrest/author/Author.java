package com.onlinebookstorespringrest.author;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.onlinebookstorespringrest.book.Book;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String authorName;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
	private Set<Book> authorBooks = new HashSet<Book>();
	
	
	
	public Set<Book> getAuthorBooks() {
		return authorBooks;
	}
	public void setAuthorBooks(Set<Book> authorBooks) {
		this.authorBooks = authorBooks;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	

}
