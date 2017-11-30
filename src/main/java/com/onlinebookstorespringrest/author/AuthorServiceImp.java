package com.onlinebookstorespringrest.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookstorespringrest.book.Book;
import com.onlinebookstorespringrest.book.BookRepository;

@Service
public class AuthorServiceImp implements AuthorService {

	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void addAuthor(Author author) {

		authorRepository.save(author);

	}

	@Override
	public List<Book> listAllBooksByAuthor(String author) {
		Author foundAuthor = authorRepository.findByAuthorName(author);
		return (List<Book>) bookRepository.findByAuthor(foundAuthor);
	}

}
