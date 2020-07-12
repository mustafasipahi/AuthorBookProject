package com.authorandbook.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorandbook.model.Author;
import com.authorandbook.repository.AuthorRepository;
import com.authorandbook.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	@Transactional
	public void saveAuthor(Author author) {		
		authorRepository.save(author);
	}

	@Override
	@Transactional
	public void updateAuthor(Author author, int id) {
		deleteAuthor(id);
		author.setId(id);
		authorRepository.save(author);
	}

	@Override
	@Transactional
	public void deleteAuthor(int id) {
		if (authorRepository.findById(id) != null) {
			authorRepository.deleteById(id);			
		}
	}

	@Override
	public Author findByAuthorId(int id) {
		return authorRepository.findByAuthorId(id);	
	}

	@Override
	public List<Author> getAll() {
		return authorRepository.findAll();
	}
}
