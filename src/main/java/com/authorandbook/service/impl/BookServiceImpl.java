package com.authorandbook.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorandbook.model.Book;
import com.authorandbook.repository.BookRepository;
import com.authorandbook.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	@Transactional
	public void saveBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	@Transactional
	public void updateBook(Book book, int id) {
		deleteBook(id);
		book.setId(id);
		bookRepository.save(book);		
	}

	@Override
	@Transactional
	public void deleteBook(int id) {
		if (bookRepository.findByBookId(id) != null) {
			bookRepository.deleteById(id);				
		}
	}

	@Override
	public Book findByBookId(int id) {
		return bookRepository.findByBookId(id);		
	}

	@Override
	public List<Book> getAll() {
		return bookRepository.findAll();
	}
}
