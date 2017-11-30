package com.onlinebookstorespringrest.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstorespringrest.book.Book;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	public void addCategory(@RequestBody Category category) {

		categoryService.addCategory(category);

	}

	@RequestMapping(value = "/category/{category_name}/books", method = RequestMethod.GET)
	public List<Book> listAllBooksByCategory(@PathVariable("category_name") String category_name) {

		return categoryService.listAllBooksByCategory(category_name);

	}

}
