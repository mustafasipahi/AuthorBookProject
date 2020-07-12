package com.authorandbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.authorandbook.model.Author;

@Repository
public interface AdminAuthorRepository extends MongoRepository<Author, Integer>{
	
	@Query(value = "{ 'id': ?0 }")
	public Author findByAuthorId(int id);
}
