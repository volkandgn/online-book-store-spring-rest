package com.onlinebookstorespringrest.book;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlinebookstorespringrest.author.Author;
import com.onlinebookstorespringrest.category.Category;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByCategory(Category category);
	List<Book> findByAuthor(Author author);
	Book findById(Long id);

}
