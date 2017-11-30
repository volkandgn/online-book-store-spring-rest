package com.onlinebookstorespringrest.category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
	
		Category findByCategoryName(String categoryName);

}
