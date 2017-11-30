package com.onlinebookstorespringrest.category;

import java.util.List;

import com.onlinebookstorespringrest.book.Book;

public interface CategoryService {

	void addCategory(Category category);
	List<Book> listAllBooksByCategory(String category);
	
}
