package com.onlinebookstorespringrest.stock;

import org.springframework.data.repository.CrudRepository;

import com.onlinebookstorespringrest.book.Book;

public interface StockRepository extends CrudRepository<Stock,Long> {

	Stock findByBook(Book book);
	
}
