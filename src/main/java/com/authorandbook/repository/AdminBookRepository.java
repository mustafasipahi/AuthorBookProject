package com.authorandbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.authorandbook.model.Book;

@Repository
public interface AdminBookRepository extends MongoRepository<Book, Integer>{
	
	@Query(value = "{ 'id': ?0 }")
	public Book findByBookId(int id);
}
