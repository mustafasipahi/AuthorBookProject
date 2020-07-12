package com.authorandbook.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorandbook.model.Author;
import com.authorandbook.repository.AdminAuthorRepository;
import com.authorandbook.service.AdminAuthorService;

@Service
public class AdminAuthorServiceImpl implements AdminAuthorService{

	@Autowired
	private AdminAuthorRepository adminAuthorRepository;	
	
	@Override
	@Transactional
	public void saveAuthor(Author author) {
		adminAuthorRepository.save(author);
	}

	@Override
	@Transactional
	public void updateAuthor(Author author, int id) {
		Author newAuthor = adminAuthorRepository.findByAuthorId(id);
		newAuthor = author;
		adminAuthorRepository.save(newAuthor);
	}

	@Override
	@Transactional
	public void deleteAuthor(int id) {
		if (adminAuthorRepository.findById(id) != null) {
			adminAuthorRepository.deleteById(id);
		}
	}
	
	@Override
	public Author findByAuthorId(int id) {
		return adminAuthorRepository.findByAuthorId(id);
	}
}
