package com.authorandbook.service;

import org.springframework.stereotype.Service;

import com.authorandbook.model.Book;

@Service
public interface AdminBookService {

	public void saveBook(Book book);
	public void updateBook(Book book,int id);
	public void deleteBook(int id);
	public Book findByBookId(int id);
}