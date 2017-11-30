package com.onlinebookstorespringrest.author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

	Author findByAuthorName(String authorName);
}
