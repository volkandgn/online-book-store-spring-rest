package com.onlinebookstorespringrest.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstorespringrest.author.Author;
import com.onlinebookstorespringrest.author.AuthorRepository;
import com.onlinebookstorespringrest.category.Category;
import com.onlinebookstorespringrest.category.CategoryRepository;

@Service
@RestController
public class BookServiceImp implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	AuthorRepository authorRepository;

	@Override
	public void addBook(Book book) {

		Category category = categoryRepository.findByCategoryName(book.getCategoryName());
		Author author = authorRepository.findByAuthorName(book.getAuthorName());
		book.setCategory(category);
		book.setAuthor(author);
		bookRepository.save(book);

	}

	@Override
	public List<Book> listAllBooks() {

		return (List<Book>) bookRepository.findAll();

	}

}
