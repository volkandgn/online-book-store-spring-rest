package com.onlinebookstorespringrest.book;

import java.util.List;

public interface BookService {
	
	void addBook(Book book);
	List<Book> listAllBooks();

}
