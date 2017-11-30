package com.onlinebookstorespringrest.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookService bookService;


	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public void addBook(@RequestBody Book book) {

		bookService.addBook(book);

	}

	@RequestMapping(value = "/listbooks", method = RequestMethod.GET)
	public List<Book> listAllBooks() {

		return bookService.listAllBooks();

	}

}
