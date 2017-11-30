package com.onlinebookstorespringrest.author;

import java.util.List;

import com.onlinebookstorespringrest.book.Book;

public interface AuthorService {

	void addAuthor(Author author);
	List<Book> listAllBooksByAuthor(String author);
	
}
