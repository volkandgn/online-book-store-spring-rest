package com.onlinebookstorespringrest.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstorespringrest.book.Book;

@RestController
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@RequestMapping(value = "/addauthor", method = RequestMethod.POST)
	public void addAuthor(@RequestBody Author author) {

		authorService.addAuthor(author);

	}

	@RequestMapping(value = "/author/{author_name}/books", method = RequestMethod.GET)
	public List<Book> listAllBooksByAuthor(@PathVariable("author_name") String author_name) {

		return authorService.listAllBooksByAuthor(author_name);

	}

}
