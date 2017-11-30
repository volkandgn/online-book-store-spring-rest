package com.onlinebookstorespringrest.stock;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.onlinebookstorespringrest.book.Book;

@Entity
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long stockNumber;
	private Long addStockForThisId;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Book book;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(Long stockNumber) {
		this.stockNumber = stockNumber;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Long getAddStockForThisId() {
		return addStockForThisId;
	}

	public void setAddStockForThisId(Long addStockForThisId) {
		this.addStockForThisId = addStockForThisId;
	}

	

	
	
}
