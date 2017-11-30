package com.onlinebookstorespringrest.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookstorespringrest.book.Book;
import com.onlinebookstorespringrest.book.BookRepository;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void addCategory(Category category) {
		categoryRepository.save(category);
		
	}

	@Override
	public List<Book> listAllBooksByCategory(String category) {
		
		Category foundCategory = categoryRepository.findByCategoryName(category);
		return (List<Book>) bookRepository.findByCategory(foundCategory);
	}
	
	

}
