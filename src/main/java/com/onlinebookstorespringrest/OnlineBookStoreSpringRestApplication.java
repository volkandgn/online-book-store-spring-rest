package com.onlinebookstorespringrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onlinebookstorespringrest.author.Author;
import com.onlinebookstorespringrest.author.AuthorRepository;
import com.onlinebookstorespringrest.book.Book;
import com.onlinebookstorespringrest.book.BookRepository;
import com.onlinebookstorespringrest.category.Category;
import com.onlinebookstorespringrest.category.CategoryRepository;

@SpringBootApplication
public class OnlineBookStoreSpringRestApplication implements CommandLineRunner {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreSpringRestApplication.class, args);
	}

	
	@Override
	public void run(String... arg0) throws Exception {
		
		Category science = new Category();
		science.setCategoryName("science");
		categoryRepository.save(science);
		
		Category history = new Category();
		history.setCategoryName("history");
		categoryRepository.save(history);
		
		Category culture = new Category();
		culture.setCategoryName("culture");
		categoryRepository.save(culture);
		
		Category biography = new Category();
		biography.setCategoryName("biography");
		categoryRepository.save(biography);
		
		Author destan = new Author();
		destan.setAuthorName("destan");
		authorRepository.save(destan);
		
		Author volkan = new Author();
		volkan.setAuthorName("volkan");
		authorRepository.save(volkan);
		
		Book book = new Book();
		book.setBookName("Book1");
		book.setAuthor(volkan);
		book.setCategory(science);
		book.setAuthorName("volkan");
		book.setCategoryName("science");
		bookRepository.save(book);
		
		book = new Book();
		book.setBookName("Book2");
		book.setAuthor(volkan);
		book.setCategory(culture);
		book.setAuthorName("volkan");
		book.setCategoryName("culture");
		bookRepository.save(book);
		
		book = new Book();
		book.setBookName("Book3");
		book.setAuthor(destan);
		book.setCategory(culture);
		book.setAuthorName("destan");
		book.setCategoryName("culture");
		bookRepository.save(book);
		
		book = new Book();
		book.setBookName("Book4");
		book.setAuthor(destan);
		book.setCategory(biography);
		book.setAuthorName("destan");
		book.setCategoryName("biography");
		bookRepository.save(book);
		
		book = new Book();
		book.setBookName("Book5");
		book.setAuthor(volkan);
		book.setCategory(history);
		book.setAuthorName("volkan");
		book.setCategoryName("history");
		bookRepository.save(book);
		
		book = new Book();
		book.setBookName("Book6");
		book.setAuthor(destan);
		book.setCategory(history);
		book.setAuthorName("destan");
		book.setCategoryName("history");
		bookRepository.save(book);
		
		
		
		
		
		
		
	}
}
